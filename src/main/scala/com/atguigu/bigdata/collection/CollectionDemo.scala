package com.atguigu.bigdata.collection

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object CollectionDemo {
  def main(args: Array[String]): Unit = {

    //默认都是不可变得集合
//    val array = new Array[Int](4)
//
//    array(0) = 1
    //println(array(0))

//    array(0)= 4
//    array.update(0) =5
    //println(array(0))

//    val array = Array(1,2,3,4,5)
//    array.foreach(println)//地址值
//    val ints: Array[Int] = array.:+(6)
//    ints.foreach(println)
//    println(ints.mkString("_"))
//    for (elem <- ints) {
//      println(elem)
//    }

//    val buffer: ArrayBuffer[Int] = mutable.ArrayBuffer(1,2,3,4)
    //buffer.append(5,6,7)
    //println(buffer) //一个集合
//    buffer.insert(2,1,2,3)
//    buffer+=8
//      buffer.+=(13)
//      buffer.remove(1)
//    buffer.remove(1,3)//从索引开始删除的多少个

//    buffer.foreach(println)

//    val list1: List[Int] = 1::2::3::4::5::Nil//空集合，默认生成List集合
//    val list2: List[Int] = List(6,7,8):::list1//:::扁平化
//    val list: List[Int] = list1.+:(6)//+:在尾添加，:+在头添加
//    list1(0) =10 //X 底层是调用的是update方法
//   val list3: List[Int] = list1.updated(2,10)
//    list1.foreach(println)

    //Set 无序不可重复
//    val set: Set[Int] = Set(1,2,3,4,5,6,6)
//    val set1: mutable.Set[Int] = mutable.Set(1,2,3,4,5,6)
//    set1.+=(12)
//    set1+=12
//    set1.-=(1)
//    set1.foreach(println)

    //Map 存储的是K-V键值对、
//    val map: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2,"c"->3)

    //增加数据
//    map.+=("d"->4)
//    val maybeInt: Option[Int] = map.put("d",2)//如果key存在就替换原来的值，并返回原来的值。没有就添加

//    println(maybeInt.getOrElse(0))

//    map.-=("b","c")
//    map.remove("a")
    //map.update("a",12)
//    for (elem <- map.keys) {
    // 使用get访问map集合的数据，会返回特殊类型Option(选项):有值（Some），无值(None)
//      println(elem+"="+map.getOrElse(elem,0))
//    }
//    println(map)
//    map.foreach((kv)=>println(kv))
//    map.foreach(println)

//    def test()={
//      val name = "zs"
//      val age =12
//      val work = 'M'
//      (name,age,work)
//    }
//    val (name,age,work) =test()
//    println(name+","+age+","+work)
//      val (q,r) = BigInt(19) /% 3
//    println("q="+q+" | "+"r="+r)
    def code(f: =>Unit): Unit ={
        f
      }


  }

}
