package com.atguigu.bigdata.packagefunction

object InterfaceTest {

  def main(args: Array[String]): Unit = {

    //从左到右依次初始化，已经初始化的就不会再初始化了
    val emp = new Emp05

  }
}
/*class ParentEmp05{
  println("parent emp05...")
}*/
class ParentEmp05 extends MyTrait05 {
  println("parent emp05...")
}
trait MyTrait05{
println("mytrait05...")
}
trait MyTrait055{
  println("mytrait055..")
}
//混入多个特质，采用with
class Emp05 extends ParentEmp05 with MyTrait05 with MyTrait055{
  println("This is a son....")
}