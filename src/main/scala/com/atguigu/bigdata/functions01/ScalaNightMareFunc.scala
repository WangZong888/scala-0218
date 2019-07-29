package com.atguigu.bigdata.functions01

object ScalaNightMareFunc {

  def main(args: Array[String]): Unit = {
    def f1(s: String): String = {
      return s + "-abc"
    }
    //println(f1("zhangsan"))
    //至简原则，能省则省

    //1)return可以省略，scala会使用函数体的最后一行代码作为返回值
    def f2(s: String): String = {
       s + "-abc"
    }
    //println(f2("zhangsan"))

    //2)返回值类型如果能够推断出来，则可以省略
    def f3(s: String) = {
      s + "-abc"
    }
    //println(f3("zhangsan"))

    //3)如果函数体只有一行代码，{}可以省略
    def f4(s:String) = s + "-abc"
    //println(f4("zhangsan"))
    //4)无参数还可省略
    def  f5() = "-abc"
    //println(f5())//在调用函数的时候，无参数可以省略()
    //println(f5)
    //5)如果函数没有参数的情况下，()可以省略的
    def f6 = "-abc"
    //println(f6)
    //6)如果函数声明了unit，不管函数体中怎样折腾，都没有返回值
    def f7(): Unit ={
      //return "a123"//这样写会有警告
    }
    //println(f7())
    //7)scala如果想要自动推断无返回值，省略等号"="就OK
    //这个操作很特殊，表示你可以给他任何参数，但是没有结果
    //他只做逻辑--称之为过程（只是实现处理的逻辑过程，没有结果）
    def f8() {
      "abc"
    }
    //println(f8())
    //8)如果不关心名称，只关心逻辑处理，那么函数名、关键字都可以省略
    //() -> {println("xxxxx")} //这是可以直接执行的
    //这是不可以直接执行的,因为这就是一个函数
    //() => {println("yyyyy")}
      //万物皆函数,变量也就可以是函数
    var f = () => println("yyyyy")
    f()//在调用的时候必须加上()，因为调用的是函数

  }





}
