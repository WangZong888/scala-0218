package com.atguigu.bigdata.functions

object ScalaFunction {
  def main(args: Array[String]): Unit = {
    def f1(name: String, wfie: String*): Unit = {
      println("f1....")
    }

    //f1("zs","xiaogao","zhangzifeng")
    def f2(name: String): String = {
      return name + "abc"
    }

    //println(f2("wangshiwei"))

    def f3(name: String, age: Int = 20): String = {
      age+" "+name
    }
    //println(f3("zs",12))

    def f4(name:String,age:Int = 20) = {
      age+" "+name
    }
    //println(f4("sengdie"))
    def f5():Unit={
     // return "ahha"
    }
   // println(f5())
    def f6() {
     // "asa"
    }
    println(f6())
    def f7() = {
      1+2
    }
   // println(f7())
    //def f8() =






  }
}
