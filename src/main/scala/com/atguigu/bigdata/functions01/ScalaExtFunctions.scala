package com.atguigu.bigdata.functions01

object ScalaExtFunctions {

  def main(args: Array[String]): Unit = {
    //可变参数,当没有一个参数时候，就会输出List(),
    //有参数就会输出WrappedArray(参数,参数)
    def test01(s: String*): Unit = {
      println(s"$s")
    }

    //可变参数必须放在最后一个参数位置,不然语法都通不过
    def test(name: String, s: String*): Unit = {
      println(name+" + "+s)
    }
    //test("zhangsan") //zhangsan + WrappedArray()
    //test("zs","shi","wang","ba","dan")

    //test01("wang","shi","wei")
    //参数默认值
    def test02(name: String, age: Int = 20): Unit = {
      println(s"$name,$age")
    }
    //如果参数有默认值，在调用的时候可以省略这参数
    //test02("lisi")
    //如果参数传递了值，那么就会覆盖默认值
    //test02("zhangsan",19)

    def test03(sex: String = "男", name: String): Unit = {
      println(s"$name,$sex")
    }
    //scala函数中参数传递时，是从左到右的
    //所以一般情况下，默认值都会放在最后一个参数位置
    //test03("lisi")
    //带名参数可以实现任意位置的默认值
    test03(name="lisi")
  }

}
