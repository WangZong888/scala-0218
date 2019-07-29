package com.wsw.staticdemo;

/**
 * @program: scala-0218
 * @description:
 * @author: Mr.Wang
 * @create: 2019-06-24 15:05
 **/
 class Demo {
    static{
        //sr=12;
        System.out.println("static........");
    }
    public   static int sr=10;
    static {
        System.out.println("static2.....");
    }
    Demo(){
        System.out.println("构造器...");
    }

}
