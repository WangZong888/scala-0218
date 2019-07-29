package com.atguigu.bigdata.implicits01

object  Scala_Transform02 {

  def main(args: Array[String]): Unit = {

    //隐式转化---指的是类型相互转化，不是指逻辑转化-与逻辑无关
    implicit def transform(user:User): DB ={
      new DB
    }
    val user = new User
    user.test()
    //编译出错时，才会在指定的位置加上隐式函数，
    // 如果是在main()内部声明的加的是transform$(),在main()外，加的是transform()
    user.insert()
  }

  class User{
    def test(): Unit ={
      println("test...")
    }
  }

  class DB{
    def insert(): Unit ={
      println("insert...")
    }
  }

}
//隐式函数：是以implicit关键字声明的带有单个参数的函数，这种函数将会自动应用
//将值从一种类型转化成另一种类型
//所以柯里化非常适合隐式转换函数