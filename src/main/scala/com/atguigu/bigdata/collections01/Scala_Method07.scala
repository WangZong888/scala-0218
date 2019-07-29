package com.atguigu.bigdata.collections01


object Scala_Method07 {

  def main(args: Array[String]): Unit = {

    //TODO 集合的数据之间的操作
      val list = List(1,2,3,4,5,6,7,8)
    //滑动
    //将集合中的一部分数据当成一个整体来使用,称之为窗口
    //滑动窗口
   //list.sliding(3).foreach(list => println(list))
//   list.sliding(3).foreach(println)
      list.sliding(3,2).foreach(println)







  }

}
