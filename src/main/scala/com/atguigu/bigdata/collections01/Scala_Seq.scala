package com.atguigu.bigdata.collections01

import scala.collection.mutable.ListBuffer

object Scala_Seq {

  def main(args: Array[String]): Unit = {

    //java中JDK1.8后---hashma底层数据结构是（数组+链表/红黑二叉树）
    // --最开始是数组+链表，达到阈值后是数组+红黑二叉树，之后数据减少又可以回到 数组+链表的结构
    //极限情况最多可以存1个
    //TODO 不可变集合
    //空集合 ,空集合对象 Nil
    val list3 = List()
    //1::2::3::4::list3
    val ints: List[Int] = 1::2::3::4::Nil
    println(ints.mkString(","))
    //Seq--scala中默认提供的集合全都是不可变得immutable
    //val list: List[Int] = List(1,2,3,4)
    //list是有序可重复的--顺序指的是元素插入顺序
    //val list1: List[Int] = List(5,6,7,8)
    //往数据库中插入数据是没有顺序的

    //增加数据
    //val list2: List[Int] = 5::6::7::1::list //在首添加数据
    //val list2: List[Any] = list1::list
    //将一个整体拆分为一个一个的个体，称之为扁平化:::
    //val list2: List[Any] = list1:::list
    //从尾增加
    //取数据
    //println(list(1))
    //修改数据
    //list(0) = 9 //底层调用的是update方法
    //val ints: List[Int] = list.updated(1,8) 会产生新集合
    //访问数据
    //list.foreach(println)

    //TODO 可变集合
    //val buffer: ListBuffer[Int] = ListBuffer(1,2,3,4)
    //buffer.+=(5)
    //buffer.foreach(println)
    //println(buffer.mkString(","))

  }
}
