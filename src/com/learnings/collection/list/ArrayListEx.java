package com.learnings.collection.list;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Object> arrList = new ArrayList<Object>();

        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        arrList.add(3,5); // Array List shifts at this time

        System.out.println(arrList);

        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("Kshitiz");
        strArrList.add("Mittal");

        arrList.addAll(strArrList); // Added as individual elements not multidimensional

        System.out.println(strArrList);
        System.out.println(arrList);

        // How to convert Array to ArrayList ?? ASK
        int[] intArr = new int[2];
        intArr[0] = 1;
        intArr[1] = 2;
        List al = Arrays.asList(intArr);

        // Array List Iteration
        for(Object el : arrList){
            System.out.println(el);
        }

        Iterator<Object> itr = arrList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        ArrayList<Object> lol = new ArrayList<>();
        ArrayList<Object> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        lol.add("Kshitiz");
        lol.add("Mittal");

        lol.add(l1);

        for (Object el : lol) {
            if(el instanceof List<?>){
                for (Object elInner : (List)el){
                    System.out.println(elInner);
                }
            } else {
                System.out.println(el);
            }
        }
    }
}
