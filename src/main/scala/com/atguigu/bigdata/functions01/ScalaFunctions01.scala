package com.atguigu.bigdata.functions01

object ScalaFunctions01 {

  def main(args: Array[String]): Unit = {

    //函数：无参，无返回值
    def test01(): Unit = {
      println("test012....")
    }

    // println(test01())
    //函数：无参，有返回值
    def test02(): String = {
      return "123"
    }

    // println(test02())

    //函数：有参，无返回值
    def test03(s: String): Unit = {
      println("test03...")
    }

    // println(test03("zhangsan"))
    //函数：有参，有返回值
    def test04(i: Int) = {
      i + i * i - i
    }

    // println(test04(3))
    def test05(name: String, age: Int): Unit = {
      println(s"$name,$age")
    }
    test05("zhangsan",32)
  }

}
