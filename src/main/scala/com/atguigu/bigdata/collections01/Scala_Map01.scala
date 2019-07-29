package com.atguigu.bigdata.collections01

import scala.collection.mutable

object Scala_Map01 {

  def main(args: Array[String]): Unit = {
    //TODO 不可变
    //TODO Map 存储K-V键值对，K-V
    //默认不可变集合
    //val map: Map[String, Int] = Map("a"->1,"b"->2,"c"->3)
    //修改为可变集合
    val map: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2,"c"->3)

    //增加数据
//    map.+=("d"->4)
//    map.-=("b","c")
    //put方法将相同key的value覆盖，并返回原来的value
    val maybeInt: Option[Int] = map.put("a",5)
    println(maybeInt.getOrElse(0))
    //修改数据
    //map.update("d",6)
    //访问数据
    /*for (elem <- map.keys) {
      //使用get访问map集合的数据，会返回特殊类型Option（选项）：有值（Some），无值（None）
      //println(elem+"="+map.get(elem).get)
      println(elem+"="+map.getOrElse(elem,0))
    }*/
    //println(map.get("d").getOrElse(0)) //2步合成一步下
    //println(map.getOrElse("d",0))//getOrElse方法是有值就返回，没值就用0代替
    //还有另一种查询方式
    //(Int) => U
    //(String,Int)=> U
    //(String,Int)为键值对
    map.foreach((kv)=>{println(kv)})
  }
}
