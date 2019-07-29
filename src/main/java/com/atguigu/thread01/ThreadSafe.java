package com.atguigu.thread01;

/**
 * @program: scala-0218
 * @description:
 * @author: Mr.Wang
 * @create: 2019-07-02 11:51
 **/
public class ThreadSafe {
    public static void main(String[] args) {
        final User01 user01 = new User01();


        new Thread(new Runnable() {
            @Override
            public void run() {
                user01.username="lisi";
                try{
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                System.out.println(user01.username);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                user01.username="zhangsan";
                try{
                    Thread.sleep(1000);
                }catch (Exception e){

                }
                System.out.println(user01.username);
            }
        }).start();



        System.out.println("main方法执行完了");
    }
}
class User01{
    public String  username;
}