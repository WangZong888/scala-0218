package com.atguigu.bigdata.functions01
import  scala.collection.mutable.ArrayBuffer

object ScalaHellFunction {

  def main(args: Array[String]): Unit = {

    //1)函数可以作为参数传递
    def f1(): Unit = {
      println("f1....")
    }

    //只要规则相同，都能调用
    def f11(): Unit = {
      println("f11...")
    }

    //规则不同会报错
    /*def f111(s:String): String ={
      "f111..."
    }*/
    //函数的参数声明
    //参数名：参数类型
    //函数类型：() => 返回值类型 这就是函数类型
    //(Int,Double,String...) => String
    def f2(f: () => Unit): Unit = {
      //调用
      f()
    }
    //调用
    //f2(f1)
    //f2(f11)


    //2)函数可以作为函数的返回值返回
    def f22() = {
      f1 //不加()也是调用的意思，
    }

    //f22()
    //怎样将函数不执行，直接返回呢
    //可以通过声明返回值类型(明确告诉函数要返回什么)
    def f222(): () => Unit = {
      f1
    }

    //f222()()
    //自动推断函数类型,才用特殊符号下划线(_)
    //表示不执行函数，而是直接使用函数
    def f2222() = {
      f1 _
    }

    //f2222()()
    //返回函数写的太多，但是在实际的项目中会写在函数里
    //这样写更灵活，框架中常用
    def f3(x: Int) = {
      def f33(y: Int) = {
        x + y
      }

      f33 _ //将函数进行返回
    }
    //println(f3(5)(10))

    //还有更方便的--将多个参数拆成多个参数，叫函数柯里化:参数列表的特殊声明方式
    //柯里化一定有闭包操作
    def f4(x: Int)(y: Int) = {
      x + y
    }
    //println(f4(6)(9))

    //函数闭包
    //函数在执行时，将外部引用的变量包含到函数内部的过程，称之为闭包
    //直接影响是：改变了外部变量的声明周期
    def f5(x: Int) = {
      def f55(y: Int) = {
        x + y
      }

      f55 _ //将函数进行返回
    }
    //println(f5(3)(4))

    //3)采用匿名函数
    def f6(f: String => Unit): Unit = {
      f("ssss")
    }
    /* def f66(s:String): Unit ={
       println(s)
     }
     f6(f66)*/
    //匿名函数（不用创建f66函数名了）
   // f6((s) => println(s))
    //如果参数只使用一次，那么参数可以省略，使用下划线(_)进行代替
    //f6(println(_))
    //如果只有一个参数，还可以直接省略
    //f6(println)

    //上升难度
    //将逻辑传进去，将结果返回来,下面是最原始的
    /*def f7(x: Int) = {
      def f77(y: Int) = {
        def f777(f: (Int, Int) => Int): Int = {
          f(x, y)
        }

        f777 _
      }

      f77 _
    }

    def f7777(i: Int, j: Int): Int = {
      i + j
    }
   println(f7(2)(4)(f7777))*/
    //将进行简化操作-柯里化
    def f8(x:Int)(y:Int)(f:(Int,Int)  => Int) ={
      f(x,y)
    }

    //println(f8(2)(4)((x,y) => {x+y}))
    //使用占位符-参数只用一次
    println(f8(2)(4)(_+_))

  }

}
