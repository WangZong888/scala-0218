package com.atguigu.bigdata.collections01

object Scala_Method03 {

  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,3,4)

    //化简 简化：通过指定的逻辑将集合中的数据进行聚合，从而减少数据，最终获取结果
    //聚合
    //将数据两两集合，实现运算规则
    //从源码的角度，reduce底层调用的其实就是reduceLeft
//    println(list.reduce((x, y) => (x + y)))
    println(list.reduce(_ + _))
//    println(list.reduce(_ - _))//底层就是reduceLeft
//    println(list.reduceLeft((x, y) => (x - y)))
    //底层实现源码：reversed.reduceLeft[B]((x, y) => op(y, x))
    //1,2,3,4 ---> 4,3,2,1 ---> (1-(2-(3-4)))=-2,每进行一次操作都要调换顺序
    val i: Int = list.reduceRight(_-_)
    println(i)


  }

}
