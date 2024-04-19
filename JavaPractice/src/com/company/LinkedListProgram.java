package com.company;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args) {

        //Declare LinkedList
        //LinkedList<Integer> l = new LinkedList<Integer>();
        //LinkedList<String> l = new LinkedList<String>();
        LinkedList l = new LinkedList();

        l.add(100);
        l.add("java");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);      //[100,java,15.5,A,true,null]

        System.out.println(l.size());       //6

        l.remove(3);        //[100,java,15.5,true,null]

        //Insert or add element in linkedlist
        l.add(3, "welcome");
        System.out.println(l);      //[100,java,15.5,welcome,true,null]

        //Retrive element or value
        System.out.println(l.get(3));       //welcome

        //Change the value
        l.set(5, 'X');
        System.out.println(l);      //[100,java,15.5,welcome,true,X]

        //Search element
        System.out.println(l.contains("java"));     //return true
        System.out.println(l.contains("test"));     //return false

        //isEmpty()
        System.out.println(l.isEmpty());        //return false

        //Read element from linkedlist
        //1. for loop
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }

        //2.for each loop
        for(Object e:l){
            System.out.println(e);
        }

        //3.Iterator() method
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        LinkedList l1 = new LinkedList();
        l1.add("X");
        l1.add("Y");
        l1.add("Z");
        l1.add("A");
        l1.add("B");
        l1.add("C");
        LinkedList l1_new = new LinkedList();
        l1_new.addAll(l1);
        System.out.println(l1);     //[X,Y,Z,A,B,C]

        l1_new.removeAll(l1);
        System.out.println(l1_new);     //[]

        Collections.sort(l1);
        System.out.println(l1);     //[A,B,C,X,Y,Z]

        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);     //[Z,Y,X,C,B,A]

        Collections.shuffle(l1);
        System.out.println(l1);     //[A,X,Y,B,Z,C]

        //Special method of LinkedList
        LinkedList l2 = new LinkedList();
        l2.add("dog");
        l2.add("dog");
        l2.add("cat");
        l2.add("horse");
        System.out.println(l1);     //[dog,dog,cat,horse]

        //Add first element and last element
        l2.addFirst("tiger");
        l2.addLast("elephant");
        System.out.println(l2);     //[tiger,dog,dog,cat,horse,elephant]

        //get first and last element
        System.out.println(l2.getFirst());      //tiger
        System.out.println(l2.getLast());       //elephant

        //remove first and last element
        l2.removeFirst();
        l2.removeLast();
        System.out.println(l2);     //[dog,dog,cat,horse]


    }
}
