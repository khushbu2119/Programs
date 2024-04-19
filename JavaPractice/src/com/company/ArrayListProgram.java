package com.company;
import java.util.*;

public class ArrayListProgram {
    public static void main(String[] args) {

        //Declare ArrayList
        //ArrayList<Integer> al = new ArrayList<Integer>();
        //ArrayList<String> al = new ArrayList<String>();
        //List al = new ArrayList<>();
        ArrayList al = new ArrayList();

        //Add element to arrayList
        al.add(100);
        al.add("welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al);      //[100,welcome,15.5,A,true]

        //size()
        System.out.println(al.size());      //5

        //remove
        al.remove(1);       //1 is index
        //al.remove("welcome");       //welcome is element
        System.out.println(al);     //[100,15.5,A,true]

        //insert an element
        al.add(2,"hello");      //[100,15.5,hello,A,true]

        //retreive specific element
        System.out.println(al.get(2));      //hello

        //change or repalce element
        al.set(2, "welcome");       //[100,15.5,welcome,A,true]

        //search element
        System.out.println(al.contains("welcome"));  //return true

        //isEmpty
        System.out.println(al.isEmpty());       //return false

        //iterate array
        //1. for loop
        for(int i=0; i< al.size(); i++){
            System.out.println(al.get(i));
        }

        //2.for each loop
        for(Object e:al){
            System.out.println(e);
        }

        //3.Iterator method
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList al1 = new ArrayList();
        al1.add("X");
        al1.add("Y");
        al1.add("Z");
        al1.add("A");
        al1.add("B");
        al1.add("C");
        ArrayList al1_dup = new ArrayList();
        al1_dup.addAll(al1);
        System.out.println(al1_dup);        //[X,Y,Z,A,B,C]

        al1_dup.removeAll(al);
        System.out.println(al1_dup);        //[]

        //sort using collections.sort()
        Collections.sort(al);
        System.out.println(al);     //[A,B,C,X,Y,Z]

        //Reverse sort
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);     //[Z,Y,X,C,B,A]

        //Shuffle elements
        Collections.shuffle(al);
        System.out.println(al);     //[A,C,Z,X,B,Y]
    }
}

