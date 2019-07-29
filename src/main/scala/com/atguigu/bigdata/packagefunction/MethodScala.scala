package com.atguigu.bigdata.packagefunction

object MethodScala {
  def main(args: Array[String]): Unit = {
    // 创建对象，如果直接使用类名，那么编译器会自动调用伴生对象中的apply方法
    val emp = Emp02
    val emo1 = Emp02("zhang")
  }
}
class Emp02{

}
object Emp02{
  //应用方法，用来构建对象
  def apply = new Emp02()

  def apply(name:String) = new Emp02()

  def apply(name:String,age:Int) = new Emp02()
}