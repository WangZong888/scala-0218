package com.atguigu.bigdata.collections01

import scala.collection.mutable.ArrayBuffer

object  Scala_Array {

  def main(args: Array[String]): Unit = {
    //集合部分主要讲解，集合的创建，数据的操作
    //TODO scala中的集合分为2大类：可变集合 & 不可变集合
    //TODO java:List、Set、Map 都是接口 ||java中数组不能删除数据，可以置为null或者空
    //TODO scala:序列Seq、集Set、映射Map 都是可迭代的(iterable)

    //TODO 不可变数组 --数组也是集合
    //数组，使用Array来创建数组(1) --底层也是使用java格式来创建数组的
   /* val array = new Array[Int](3)
    //增加元素,使用()不要使用[]，有特殊含义
    array(0) =1
    array(1) =2
    array(2) =4
    //修改数据
    //array(2) = 5
    array.update(2,5)*/

    //增加元素
   //val a = array :+ 6//创建新的数组
    // println(a.mkString(","))
    //查看数组(1)
    //println(array.mkString(","))
//    for (elem <- array) {
//      println(elem)
//    }
    /*def printx(elem:Int): Unit ={
     println(elem)
   }
    array.foreach(printx)*/
    //采用匿名函数
    //array.foreach((s) => {println(s)})

    //创建数组（2）
   // val ints = Array(1,2,4,3) //等同于调用伴生对象的apply函数
    //println("length="+ints.length)
    //ints.foreach(println)

    //TODO 可变数组
    val buff: ArrayBuffer[Int] = ArrayBuffer(1,2,3,4,5)

    //添加数组
    //buff.append(6,7,8) //向数组的最后追加数据
    //buff.insert(2,7,8)//向指定的位置添加数据
    //buff.+=(10)//在最后追加

    //修改数据
    //buff(1) = 11
    //buff.update(1,12)

    //删除数据
    //删除指定索引
   // buff.remove(1)
    //从指定索引开始删除多少个
    //buff.remove(1,2)

    //访问数据
    //打印数据

    // for (elem <- buff) {println(elem)}
    //buff.foreach(println)
    println(buff.mkString(","))

  }
}
