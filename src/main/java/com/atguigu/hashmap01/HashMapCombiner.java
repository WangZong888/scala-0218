package com.atguigu.hashmap01;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @program: scala-0218
 * @description:
 * @author: Mr.Wang
 * @create: 2019-07-01 11:16
 **/
public class HashMapCombiner {

    public static void main(String[] args) {

        Map<String, Integer> map1 = new HashMap();
        Map<String, Integer> map2 = new HashMap();

        map1.put("a",2);
        map1.put("b",3);
        map1.put("c",4);

        map2.put("a",3);
        map2.put("b",2);
        map2.put("d",5);
        Iterator<String> iterator = map1.keySet().iterator();
        while(iterator.hasNext()){
             String key = iterator.next();
             Integer value = map1.get(key);
             if(map2.containsKey(key)){
                 value=value+map2.get(key);
             }
             map2.put(key,value);
         }
        Iterator<Integer> iterator1 = map2.values().iterator();
        while(iterator1.hasNext()){
            System.out.println("map2="+iterator1.next());
        }


    }
}
