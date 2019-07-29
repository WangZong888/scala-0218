package com.atguigu.bigdata.functions

object ScalaFunction01 {

  def main(args: Array[String]): Unit = {


    //"(y:Double) => x*x*y"
    def test(x: Double) = {
      (y: Double) => x * x * y
    }

    val res = test(2.0)(3.0)
    //println("res=" + res)

    //
    def test1(x: Double) = {
      // (Double) => Double = (y:Double) => x*x*y
      def test2(y: Double) = {
        def test3(f: (Double, Double) => Double) = {
          f(x, y)
        }

        test3 _
      }

      test2 _
    }

    // println(test1(2.0)(3.0)(_*_ ))
    //柯里化
    def test4(x: Double)(y: Double)(f: (Double, Double) => Double) = {
      f(x, y)
    }

    println(test4(2.0)(3.0)((x, y) => (x * x * y + x + y)))

  }

}
