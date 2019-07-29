package com.atguigu.bigdata.collections01

import scala.collection.mutable


object Scala_Method06 {

  def main(args: Array[String]): Unit = {

    //TODO 集合之间的操作
      val list1 = List(1,2,3,4)
      val list2 = List(4,5,6,7,8)

    //并集
//    val list = list1.union(list2)
//    println(list)
    //交集
//    val list = list1.intersect(list2)
//    println(list)
    //差集--有个主动方的概念，主动方中除去相同的部分
//    val list = list1.diff(list2)
//    println(list)

    //拉链-zip,成对出现，将多余的数据省略不用
    val list = list1.zip(list2)
    println(list)




  }

}
