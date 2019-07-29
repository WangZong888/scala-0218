package com.wsw.staticdemo;

import java.lang.reflect.Field;

/**
 * @program: scala-0218
 * @description:
 * @author: Mr.Wang
 * @create: 2019-06-24 20:28
 **/
public class StringDemo {

    private  int i;
    public static void main(String[] args) throws Exception {
        //String不可变是指的是值(地址)不可变，而不是内容不可变，内容可以
        //通过反编译进行修改的

        char c = 'a'+'b'+10;
        String s = " a d ";
//        s.trim();
        //拿到属性类
        Field f = s.getClass().getDeclaredField("value");
        f.setAccessible(true);
        //根据对象拿到属性值
        char[]  cs = (char[])f.get(s);
        //修改内容
        cs[2]='c';
        System.out.println(s);

        //测试空指针异常,针对的是成员属性和方法，而不是类属性和类方法
        AA aa = new AA();
        aa=null;
        //aa.test("sss");
        AA.test1("sss");
        System.out.println("i="+new StringDemo().i);


    }
}
class AA {
    public static int i = 12;
    public void test(String s){
        System.out.println(s+"---");
    }
    public static void test1(String s){
        System.out.println(s+"+++");
    }
}

