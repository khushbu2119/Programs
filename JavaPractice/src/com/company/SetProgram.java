package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.lwawt.macosx.CSystemTray;

import java.util.*;

public class SetProgram {
    public static void main(String args[]){

        //arraylist
        /*ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(300);
        al.add(300);
        al.add(00);
        al.add(null);
        al.add(290);
        al.add(100);

        System.out.println(al);         //[10, 300, 0, 290, 100]
        System.out.println(al.get(2));      //0

        al.remove(2);
        al.remove(Integer.valueOf(290));  // Why I am not able to remove with value when its a integer arrayList
        System.out.println(al);     //[10, 300, 290, 100]

        al.add(297);
        al.add(4,202);
        al.add(876);
        al.add(200);

        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }

        ArrayList<String> a = new ArrayList();
        a.add("khushbu");
        a.add("dipen");
        a.add("deep");
        System.out.println(a);
        a.remove("khushbu");
        System.out.println(a); */

        //linkedlist
        /*LinkedList<String> l = new LinkedList<>();
        l.add("khushbu");
        l.add("Dipen");
        l.add("Dipen");
        l.add("Chirag");
        l.add("Param");
        l.add("Stuti");
        System.out.println(l);

        l.add(2,"Deep");
        System.out.println(l.get(2));
        System.out.println("first element:" + l.getFirst());
        System.out.println("last element:" + l.getLast());
        System.out.println("size of linkedlist:" + l.size());
        System.out.println(l);
        l.remove(4);
        l.remove("Deep");
        System.out.println(l);

        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        //hashset > duplicate not allowed and insertion order not maintain
        /*HashSet<Object> hs = new HashSet<>();
        hs.add(11);
        hs.add("welcome");
        hs.add(null);
        hs.add("java");
        hs.add("java");
        hs.add('A');
        hs.add(8.8);
        System.out.println(hs);     //[null, A, java, 11, 8.8, welcome]

        System.out.println(hs.contains("java"));
        hs.remove('A');
        System.out.println(hs);

        for(Object value:hs)
        {
            System.out.println(value);
        }

        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/

        //LinkedHashSet > duplicate not allowed insertion order maintain
        /*LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("khushbu");
        lhs.add("dipen");
        lhs.add("dipen");
        lhs.add("chirag");
        lhs.add("krishna");
        lhs.add("deep");
        lhs.add("kinjal");
        System.out.println(lhs);

        System.out.println(lhs.contains("khushbu"));
        lhs.remove("kinjal");
        System.out.println(lhs);

        int index =3;
        int currentIndex= 0;
        Object currentValue= null;
        Iterator it = lhs.iterator();
        while(it.hasNext()){
            currentValue = it.next();
            if(currentIndex == index-1 ){
                System.out.println("Element at index " + currentIndex + " is "+ currentValue);
                break;
            }
            currentIndex++;
        }*/

        //Treeset > Duplicate not allowed and stored in sorted format
        /*TreeSet<Integer> ts = new TreeSet();
        ts.add(11);
        ts.add(12);
        ts.add(10);
        ts.add(13);
        ts.add(13);
        ts.add(14);
        System.out.println(ts);     //[10, 11, 12, 13, 14]

        ts.remove(10);
        System.out.println(ts);

        TreeSet ts1 = new TreeSet();
        ts1.addAll(ts);
        System.out.println(ts1);
        ts1.add(17);
        ts1.add(15);
        System.out.println(ts1);
        ts1.removeAll(ts);
        System.out.println(ts1);*/

        //Hashmap > key value pair, get value from key (one null key allowed, multiple null value allowed)
        /*HashMap<Integer, String> hm =  new HashMap<>();
        hm.put(1, "khushbu");
        hm.put(2, "dipen");
        System.out.println(hm);
        hm.put(3,"deep");
        hm.put(3,"chirag");
        hm.put(4,"dipen");
        hm.put(null, "khushbu");
        hm.put(5,null);
        hm.put(6, null);
        System.out.println(hm);
        System.out.println(hm.get(1));
        hm.remove(5);
        Iterator it = hm.keySet().iterator();
        while (it.hasNext()){
            System.out.println(hm.get(it.next()));
        }*/

        //LinkedHashMap
       /* LinkedHashMap<Integer,String> hsm = new LinkedHashMap<>();
        hsm.put(1, "khushbu");
        hsm.put(2, "dipen");
        System.out.println(hsm);
        hsm.put(3,"deep");
        hsm.put(3,"chirag");
        hsm.put(4,"dipen");
        hsm.put(null, "khushbu");
        hsm.put(5,null);
        hsm.put(6, null);
        System.out.println(hsm);
        hsm.remove(5);
        hsm.remove(1, "khushbu");
        System.out.println(hsm);
        */

        /*int a[] = { 1, 2, 3, 4, 5, 8, 11 };
        int index = 0;
        for(int i=0; i<a.length; i++){
            if(i == a[index]) {
                index++;
            }else{
                System.out.println(i);
            }
        }*/

        /*Arrays.sort(a);
        int min = a[0];
        int max = a[a.length-1];
        HashSet hs = new HashSet();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        System.out.println(hs);
        for(int i=0; i<max; i++){
            if(!hs.contains(i)){
                System.out.println(i);
            }
        }*/
        int sum=0;
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

        /*HashSet<Integer> intSet = new HashSet<>();
        intSet.add(100);
        intSet.add(200);
        intSet.add(300);
        intSet.add(100);
        intSet.iterator();

        for(int set : intSet){
            System.out.println(set);
        }


        // get(0) will not work here
        //Duplicate values are not added in set*/

    }
}
