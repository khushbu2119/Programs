package com.company;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add("welcome");
        hs.add(15.5);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);     //[100,welcome,15.5,A,true,null]

        //remove()
        hs.remove(15.5);
        System.out.println(hs);     //[null,welcome,100,A,true]

        //contains()
        System.out.println(hs.contains("welcome"));     //return true
        System.out.println(hs.contains(1));     //return false

        System.out.println(hs.isEmpty());       //return false

        //Reading objects from hashSet
        //1. for each
        for(Object e:hs){
            System.out.println(e);
        }

        //2.Iterator()
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println(evenNumber);     //[2,4,6]

        HashSet<Integer> number = new HashSet<>();
        number.addAll(evenNumber);
        number.add(10);
        System.out.println(number);     //[2,4,6,10]

        number.removeAll(evenNumber);
        System.out.println(number);     //[10]

        //Union
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println(set1);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        //Union
        set1.addAll(set2);
        System.out.println("Union:" +set1);     //[1,2,3,4,5]

        //Intersection
        set1.retainAll(set2);
        System.out.println("Intersection:"  +set1);     //[3,4,5]

        //Difference
        set1.removeAll(set2);
        System.out.println("difference:" +set1);        //[1,2]

        //subset
        System.out.println(set1.containsAll(set2));     //true (It will check all set2 elements are available in ste1 or not.)
    }
}
