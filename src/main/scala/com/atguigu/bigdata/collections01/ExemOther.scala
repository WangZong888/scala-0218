package com.atguigu.bigdata.collections01

object ExemOther {

  def main(args: Array[String]): Unit = {
    //List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
    //请对下列集合数据进行单词计数统计，并取排名前三单词
    val lists: List[(String, Int)] = List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

    //1）分清楚题意，（元素）字符串的出现的次数---另一种解题思路：将一个整体拆分一个一个的个体--flatMap 扁平化
    /**
      * (Hello,4) (Scala,4) (Spark,4) (World,4)
      * (Hello,3) (Scala,3) (Spark,3)
      * (Hello,2) (Scala,2)
      * (Hello,1)
     */
//    val listTuple: List[(String, Int)] = lists.flatMap {
//          //思路：先将单词一个一个拿出来，（string） => (string,int)  在进行类型转化-map
//      tuple =>
//        val strings = tuple._1.split(" ")
//        strings.map(str => (str, tuple._2))
//    }
    val listTuple: List[(String, Int)] = lists.flatMap(tuple => tuple._1.split(" ").map((_,tuple._2)))
    println(listTuple)

    //2) 将单词进行分组--groupBy
    val listToTuples: Map[String, List[(String, Int)]] = listTuple.groupBy(_._1)
    println(listToTuples)
    //3）进行进行统计--(word,list) => (word,count) 进行类型转化---map
   // val stringToInt: Map[String, Int] = listToTuples.map(tuple => (tuple._1,tuple._2.map(_._2).sum))
    //scala自己提供的
    /*val stringToInts: Map[String, List[Int]] = listToTuples.mapValues(_.map(_._2))
    val stringToInt: Map[String, Int] = stringToInts.map(t => (t._1,t._2.sum))*/
    val stringToInt: Map[String, Int] = listToTuples.mapValues(_.map(_._2).sum)
    println(stringToInt)
    //4) 在进行排序（降序）--使用sortWith --Map是无序的--转换成List，才可以进行排序
    val tuples: List[(String, Int)] = stringToInt.toList.sortWith(_._2 > _._2)
    println(tuples)
    //5）  取出前三--take
    val tuples2: List[(String, Int)] = tuples.take(3)
    println(tuples2)
  }

}
