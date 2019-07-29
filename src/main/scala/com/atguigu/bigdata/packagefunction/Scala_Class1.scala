package com.atguigu.bigdata.packagefunction

object Scala_Class1 {

  def main(args: Array[String]): Unit = {
    //val colors = new Colors
    //println(colors.RED)
    println(Colors.BLUE)
    println(Colors.YELLOW)
  }
}
//使用伴生类需要创建对象才能用，就不叫枚举了，一般使用的是伴生对象，他是模拟静态类，类似于枚举
/*
class Colors extends Enumeration{
  val RED = Value(1,"red")
  val YELLOW = Value(2,"yellow")
  val BLUE = Value(3,"blue")
}*/
object Colors extends Enumeration{
  val RED = Value(1,"red")
  val YELLOW = Value(2,"yellow")
  val BLUE = Value(3,"blue")
}
//可以不用使用main（入口函数）方法
//这叫应用类
object Test1 extends App {
  println("不用使用main()函数，而是继承特质App")

}
//如果属性或者方法是不完整的，那么需要将类声明为abstract
abstract class Test2{
  val age : Int
  val name : String = ""
}