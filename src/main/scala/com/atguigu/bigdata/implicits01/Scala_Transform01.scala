package com.atguigu.bigdata.implicits01

object  Scala_Transform01 {

  def main(args: Array[String]): Unit = {
   //scala希望在编译出错的时候，尝试使用转化规则，让编译器通过，这个操作称之为隐式转化--相当于2次编译
    //double --> int
    //需要使用特殊语法：implicit
    //隐式转化---就是类型转化
    implicit def transform(d:Double): Int={
      d.toInt
    }
    val a: Int = 1.4
    println(a)
  }
}
