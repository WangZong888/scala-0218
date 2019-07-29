package com.atguigu.bigdata.implicits01

import com.atguigu.bigdata.implicits01.Scala_Transform05.User4
/*package test{
  package object Package04{
    //在工作中要扩展新功能，可以创建隐式类
    //隐式类：类型1 => 类型2,隐式类必须传一个(有且只有一个)参数
    implicit class Person4(user:User4){
      def insert(): Unit ={
        println("insert...")
      }
    }
  }
}*/

object  Scala_Transform05 extends MyTrait5 {

  def main(args: Array[String]): Unit = {

    val user = new User4
    user.test()
    user.insert()
  }

  class User4{
    def test(): Unit ={
      println("test...")
    }
  }

}
//隐式查找范围--->从当前范围一级一级往上找
//查找范围--->先在当前范围(object)查找，没有就会从父类的特质（一般在伴生对象）中查找
trait MyTrait5{

}
object MyTrait5{
  //在工作中要扩展新功能，可以创建隐式类
  //隐式类：类型1 => 类型2,隐式类必须传一个(有且只有一个)参数
  implicit class Person4(user:User4){
    def insert(): Unit ={
      println("insert...")
    }
  }
}

//class Test04{
//  //在工作中要扩展新功能，可以创建隐式类
//  //隐式类：类型1 => 类型2,隐式类必须传一个(有且只有一个)参数
//  implicit class Person4(user:User4){
//    def insert(): Unit ={
//      println("insert...")
//    }
//  }
//}

//隐式类必须定义在“类”或者“伴生对象”或者“包对象中”不能是顶级的(top-level objects)
/*
implicit class Test{

}*/
