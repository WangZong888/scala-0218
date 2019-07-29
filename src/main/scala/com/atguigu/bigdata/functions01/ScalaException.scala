package com.atguigu.bigdata.functions01

object ScalaException {

  val age : Int = 12
  def main(args: Array[String]): Unit = {

    println("age="+age)
    try {
      val r = 10 / 0
    } catch {
      //case ex: Exception => println ("捕获了异常")
      case ex: ArithmeticException => println(" 捕获了除数为零的算术异常")
      case ex: Exception => println("捕获了异常")
    } finally {
      // 最终要执行的代码
      println("scala finally...")
    }

  }

}
