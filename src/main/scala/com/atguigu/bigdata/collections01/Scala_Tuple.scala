package com.atguigu.bigdata.collections01

import scala.collection.mutable

object Scala_Tuple {

  def main(args: Array[String]): Unit = {

    //多个无关数据无法封装成类
    //scala语言可以使用特殊的结构将无关的数据作为整体来使用
    //特殊的结构称之为Tuple(元组)，声明方式：（元素1，元素2，元素3）
    //元组中元素数量最多只有22个----函数的参数列表也只有个22个
    //val tuple: (Int, String, Boolean) = (40,"xxxx",true)
    //访问元组,通过元素的顺序进行访问的，调用方式：_顺序号
//    println(tuple._1)
//    println(tuple._2)
//    println(tuple._3)

    //Map中的键值对其实就是元组，只不过元组的元素个数为2，称之为对偶
    val map = Map("a"->1,"b"->2,"c"->3)
    map.foreach(tuple => {println(tuple._1+"="+tuple._2)})
  }
}
