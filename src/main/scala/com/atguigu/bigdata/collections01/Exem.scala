package com.atguigu.bigdata.collections01

object Exem {

  def main(args: Array[String]): Unit = {
    //List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))
    //请对下列集合数据进行单词计数统计，并取排名前三单词
    val lists: List[(String, Int)] = List(("Hello Scala Spark World", 4), ("Hello Scala Spark", 3), ("Hello Scala", 2), ("Hello", 1))

   /* //0）分清楚题意，（元素）字符串的出现的次数-(string,int) => string 类型转化-map
    val stringList: List[String] = lists.map(tuple => (tuple._1+" ")*tuple._2)
    println(stringList)
    //1）将list中的元组拆分成一个一个的单词 --flatMap
    val strings: List[String] = stringList.flatMap(_.split(" "))
    //println(strings)
    //2) 将单词进行分组--groupBy
    val wordToList: Map[String, List[String]] = strings.groupBy(word => word)
    println(wordToList)
    //3）进行进行统计--聚合--(word,list) => (word,count) 进行类型转化---map
    val wordToCount: Map[String, Int] = wordToList.map(tuple => (tuple._1,tuple._2.size))
    println(wordToCount)
    //4) 在进行排序（降序）--使用sortWith --Map是无序的--转换成List，才可以进行排序
    val tuples: List[(String, Int)] = wordToCount.toList.sortWith(_._2 > _._2)
    println(tuples)
    //5）  取出前三--take
    val tuples2: List[(String, Int)] = tuples.take(3)
    println(tuples2)*/

    //将上面组合在一起
    val tuples: List[(String, Int)] = lists.map(tuple => (tuple._1 + " ") * tuple._2).flatMap(_.split(" ")).
      groupBy(word => word).map(tuple => (tuple._1, tuple._2.size)).toList.sortWith(_._2 > _._2).take(3)
    println(tuples)
  }

}
