package com.atguigu.bigdata.demo

object ScalaDemo {
  def main(args: Array[String]): Unit = {
   // println("Hello World")
    //printf(test())
    var name:String = "zhangsan"
    var age: Int = 12
    println(s"$name,$age")
    println(f"$name,$age%.2f")
    println(raw"${name.length},$age")
    println(
      s"""
          name=$name
          age=$age
       """)

    for{
      i <- Range(1,18,2)
      j = (18  - i)/2}{
      println(" "*j +"*"*i)
    }
  for(i <- Range(1,7,2)){
    println("I="+i)
  }


  }
}
