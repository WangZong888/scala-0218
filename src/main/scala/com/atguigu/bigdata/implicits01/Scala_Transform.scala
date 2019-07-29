package com.atguigu.bigdata.implicits01

object  Scala_Transform {

  def main(args: Array[String]): Unit = {
    var b:Byte =10
    var c:Char = 'a'+10//编译器有问题，这是可以的--其实'a'+10就是个常量
    var i:Int = b+c+'a'+10
    //var c1:Char = 'v'+c 会提升数据类型

    //将精度小的数据类型可以自动转换为精度大的数据类型，称之为隐式转化
    //底层解析成基本数据类型--可以自动转化
    var j : Int = 0.1.toInt
    var i1:Int = b


    println(c)
    println(i)
    //println(c1)
    println(i1)
    println(j)
  }
}
