package com.wsw.staticdemo;

/**
 * @program: scala-0218
 * @description:
 * @author: Mr.Wang
 * @create: 2019-06-24 15:06
 **/
public class Test {
    public static void main(String[] args) {
    /*    System.out.println(Demo.sr);
//        short s = 12;
//        short a = s+1;//变量相加会有类型转换（int）
        short a = 'a'+1;//常量可以直接加
        System.out.println(a);
        int i = 0;
        i = i++;
        System.out.println(i);*/
    CC cc = new BB();
//    cc.tt();
        System.out.println(cc.i);
        ((BB) cc).yy();//多态引用不能直接调用子类新增的方法,必须强制向下转型

    }
}
class CC{
    public int i=10;
    public void tt(){
        System.out.println("cc...");
    }
}

class BB extends CC {
    public int i=12;
    public void tt(){
        System.out.println("bb...");
    }
    public void yy(){
        System.out.println("yy...");
    }
}