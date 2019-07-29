package com.atguigu.bigdata.implicits01

object  Scala_Transform03 {

  def main(args: Array[String]): Unit = {

    //(隐式参数-隐式变量)--->可以不用在声明的时候就设定好
    //写代码的时候才设定
    //隐式参数
    def hello(implicit name:String ="tom" ): Unit ={
      println(name+"-hello")
    }
    //hello("zhangsan")
    //隐式变量--->可以优先覆盖默认参数
    implicit val str1 : String = "wangwu"
    //在同一作用域中，相同类型转换的规则应该只有一个
    //implicit val str2 : String = "jack"
    implicit val age : Int = 14
    hello
  }
}
