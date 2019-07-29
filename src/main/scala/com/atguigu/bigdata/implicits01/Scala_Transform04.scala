package com.atguigu.bigdata.implicits01

object  Scala_Transform04 {

  def main(args: Array[String]): Unit = {

    //隐式类--在scala2.10之后提供的，可以使用implicit声明类，
    //隐式类非常强大，同样可以扩展类的功能，前面使用隐式转换丰富类库的功能更加的方便
    //在集合中隐式类会发挥重要的作用
    //隐式类的特点
    /**
      * 1)其所带的构造参数有且只能有一个
      * 2)隐式类必须定义在“类”或者“伴生对象”或者“包对象中”不能是顶级的(top-level objects)
      * 3)隐式类不能是case class
      * 4)作用域中不能有与之相同名称的标识符
     */
      //隐式转换时机
    /**
      * 1)当方法中的参数类型与目标类型不一致时
      * 2）当对象调用所在类中不存在方法或成员时，编译器会自动将对象进行隐式转换
      */
    val user = new User4
    user.test()
    user.insert()
  }

  class User4{
    def test(): Unit ={
      println("test...")
    }
  }

  //在工作中要扩展新功能，可以创建隐式类
  //隐式类：类型1 => 类型2,隐式类必须传一个(有且只有一个)参数
  implicit class Person4(user:User4){
    def insert(): Unit ={
      println("insert...")
    }
  }
}

//隐式类必须定义在“类”或者“伴生对象”或者“包对象中”不能是顶级的(top-level objects)
/*
implicit class Test{

}*/
