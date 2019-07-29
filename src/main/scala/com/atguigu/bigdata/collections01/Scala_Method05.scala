package com.atguigu.bigdata.collections01

import scala.collection.mutable


object Scala_Method05 {

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1, 2, 3, 4)

    //两个map的数据合并
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    val map2 = mutable.Map("a" -> 4, "b" -> 5, "d" -> 6)

    val map3 = map2.foldLeft(map1) {
      (map, kv) =>
        val k = kv._1
        val v = kv._2
        map(k) = map.getOrElse(k, 0) + v
        map
    }
    println(map3)


  }

}
