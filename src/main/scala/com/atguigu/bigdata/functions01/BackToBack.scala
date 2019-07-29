package com.atguigu.bigdata.functions01

object BackToBack {

  def main(args: Array[String]): Unit = {
    //递归算法
    //1)方法调用自身
    //2)方法必须要有跳出逻辑
    //3)方法调用自身时，传递的参数应该有规律
    //4)scala中的递归必须声明方法返回值类型，因为不能自动推断出来
    //println(test(5))
    //惰性加载,只用在使用的时候才加载-改变了逻辑顺序
    //使用场景是-不清楚是否用得上的数据，可以使用lazy
    lazy val res = sum(10,20)
    println("--------------")
    println("res= "+res)
  }

  //递归方法
  def test(i: Int): Int = {
    if (i == 1) {
      1
    } else {
      i * test(i - 1)
    }
  }

  //延迟加载方法
  def sum(n1: Int, n2: Int) = {
    println("sum()执行了...")
    n1 + n2
  }
}
