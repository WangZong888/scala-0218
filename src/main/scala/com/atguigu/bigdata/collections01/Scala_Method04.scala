package com.atguigu.bigdata.collections01

object Scala_Method04 {

  def main(args: Array[String]): Unit = {

    //折叠 ：化简的一种特殊方式
    val list = List(1,2,3,4)

    //fold方法使用了函数柯里化，存在2个参数列表
    //第一个参数列表：零值（初始值）
    //第二个参数列表：

    //底层其实为foldLeft
    //val i = list.fold(1)((x,y) => x+y)
    //val i = list.fold(1)(_+_)
    val i = list.foldRight(10)(_-_)
    println(i)

  }

}
