package com.atguigu.bigdata.collections01

object WordCount {

  def main(args: Array[String]): Unit = {
    //单词计数
    //将集合中出现的相同的单词进行计数，取计数前三的结果
    val stringsList = List("Hello Scala Hbase Kafka","Hello Scala Hbase","Hello Scala","Hello")

    //1)将每一个字符串转换成一个一个单词 -扁平化操作
    val wordList: List[String] = stringsList.flatMap(_.split(" "))
    println(wordList)

    //2)将相同的单词放置在一起--groupBy操作
    val wordToStrings: Map[String, List[String]] = wordList.groupBy(word => word)
    println(wordToStrings)

    //3)对相同的单词进行计数--聚合jb
    //(word,list) => (word,count)进行类型转化--map操作
    val wordToCount: Map[String, Int] = wordToStrings.map(tuple => (tuple._1,tuple._2.size) )
    println(wordToCount)

    //4)对计数完后的结果进行排序（降序）--sortWith操作,但是的首先将Map类型转换成List类型，才可以排序
    //val tuples: List[(String, Int)] = wordToCount.toList.sortWith((left, right) => left._2 > right._2)
    val tuples: List[(String, Int)] = wordToCount.toList.sortWith(_._2 > _._2)
    println(tuples)
    //5)对排序后的结果取前三 --take操作
    val tuples2: List[(String, Int)] = tuples.take(3)
    println(tuples2)

  }

}
