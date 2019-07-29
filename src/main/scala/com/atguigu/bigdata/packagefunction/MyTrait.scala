package com.atguigu.bigdata.packagefunction

trait MyTrait extends MyParentClass with App {

  //scala中没有接口这概念
  //scala中将多个对象具有的相同特征从对象中剥离出来，形成独立的结构，称之为"特质"trait
  //this.run()
  //工具类一般是公共的，所有的都能访问，父类一般是protected，只有子类才能访问，
  //自己设计类看需要哪些范围的人访问
  //可以声明属性
  val name : String = "zs"
  //可以声明方法
  def test(): Unit ={
    println("test...")
  }
  //可以是不完整的
  var age : Int
  def test01():Unit
}
class MyParentClass{
}

//-----------------------
object LogClass  extends App{
  //private val emp1 = new Emp11
  //只能给类型--可以简化
  type Em = Emp11
  private val em = new Em
  em.log()
}
//必须在异常场景下使用
class Emp11 extends Exception with Logger{

}
//自身类型--告诉他是什么类型
//可以限定特质的应用场景
trait Logger{
  this:Exception =>
  def log(): Unit ={
    println(getMessage)
  }
}
//type关键字，给数据类型起一个别名--如：type S = String
