package com.atguigu.bigdata.packagefunction

object TestContruct {

  def main(args: Array[String]): Unit = {
    val emp = new Emp("男",12)
    println(emp)
    val emp01 = Emp01
  }

}
class ParentEmp(s:String){
  println(s+"-父类构造函数体1...")
  println(s+"-父类构造函数体2...")
  def this(){
    this("parent")
    println("parent....")
  }
  def this(name:String,age:Int){
    this()
  }
  println(s+"-父类构造函数体3...")
}
class Emp(s:String) extends ParentEmp {
  println(s+"-构造函数体....")
  def this(){
    this("zhang")
    println("son....")
  }
  def this(s:String,age:Int){
    this("lisi")
    println(s+"-lisi...-"+age)
  }
}
class Emp01 private() {
}

object Emp01{
  def apply(): Emp01 = new Emp01()
}
