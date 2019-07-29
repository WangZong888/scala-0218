package com.atguigu.hashmap01;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: scala-0218
 * @description:
 * @author: Mr.Wang
 * @create: 2019-06-30 14:53
 **/
public class HashMapMax {

    //java中JDK1.8后---hashma底层数据结构是（数组+链表/红黑二叉树）
    // --最开始是数组+链表，达到阈值后是数组+红黑二叉树，之后数据减少又可以回到 数组+链表的结构
    //极限情况存第11个的实惠就开始变
    //测试极限情况，存第11个元素就开始从 数组+链表 ==> 数组 + 红黑二叉树
    public static void main(String[] args) {
        Map<User,User> map = new HashMap<>();

        for(int i=1;i<13;i++){
            User user = new User();
            map.put(user,user);
            System.out.println("只为调试用");
        }

    }


}
class User{
    //满足极限的条件是
    //1.hash值要相等,2.存的数据不相等
    //所以需要重写hashcode与equals方法


    @Override
    public int hashCode() {
        return 1;//恒等
    }

    @Override
    public boolean equals(Object obj) {
        return false;//恒不等
    }
}