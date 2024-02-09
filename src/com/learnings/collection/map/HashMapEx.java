package com.learnings.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String , Integer> hm = new HashMap<>();

        hm.put("K", 10);
        hm.put("S", 20);
        hm.put("H", 30);
        hm.put("I", 67);
        hm.put("T", 88);
        hm.put("Z", 56);

        System.out.println("Initial HashMap : "+hm);

        hm.remove("Z",90);
        hm.remove("Z");

        System.out.println("After Removal : "+hm);

        for (Map.Entry<String,Integer> el : hm.entrySet()){
            System.out.println("Key : "+el.getKey());
            System.out.println("Value : "+el.getValue());
        }

        hm.replaceAll((k,v) -> v - 1);

        hm.forEach(
                (key, value) -> System.out.println(key+" = "+value)
        );


        HashMap<Integer, Object> hm2 = new HashMap<>();
        hm2.put(1, 23);
        hm2.put(2, 13);
        hm2.put(3, 45);
        hm2.put(4, hm);

        // nested for each iteration example in hashmap
        hm2.forEach(
                (key, value) -> {
                    if(value instanceof Map<?,?>){
                        ((Map<?, ?>) value).forEach(
                                (keyIn,valueIn)-> {
                                    System.out.println(keyIn+" = "+valueIn);
                                }
                        );
                    } else {
                        System.out.println(key+" = "+value);
                    }
                }
        );
    }
}
