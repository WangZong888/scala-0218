package com.atguigu.bigdata.implicits01

object Implicait01 {

  def main(args: Array[String]): Unit = {

    //自己写一个隐式函数
    implicit def transform(mysql:Mysql): DB ={
      new DB
    }
    val mysql = new Mysql
    mysql.insert()
    mysql.delete()//需要写一个隐式函数-->转换类型
  }
}
class Mysql {
  def insert(): Unit ={
    println("insert...")
  }
}
class DB{
  def delete(): Unit ={
    println("delete...")
  }
}