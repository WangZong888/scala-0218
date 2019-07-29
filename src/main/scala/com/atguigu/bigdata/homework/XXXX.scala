package com.atguigu.bigdata.homework

object XXXX {


    def main(args: Array[String]): Unit = {

      println(test(5))
      def test(x:Int): Int ={
        if(x == 1){
          1
        }else if((x-1)%2 == 0 ){
          x-test(x-1)
        }else{
          x+test(x-1)
        }
      }
    }

}
