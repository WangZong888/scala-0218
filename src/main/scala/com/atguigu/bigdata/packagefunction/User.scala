package com.atguigu.bigdata.packagefunction
package test
package test1{

  //import com.atguigu.bigdata.packagefunction.test.test1.test2.Packs

  object TestOne{
    def main(args: Array[String]): Unit = {
      val user = User
      //new Packs
    }
  }
  object User {
    def apply: User = new User()

    //def apply() = new User(String,Int)
  }
  class User{
    //val 声明的不能使用_来初始化
    /*val name : String = _
    val age : Int = _*/
  }
  package test2{
    class Packs{

    }
  }

}
