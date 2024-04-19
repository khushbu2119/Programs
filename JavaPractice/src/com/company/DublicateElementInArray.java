package com.company;

import java.util.HashSet;

public class DublicateElementInArray {
    public static void main(String args[]){
        int a[]={1,4,6,7,4,2,8};
        /*boolean status = true;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] == a[j]){
                    System.out.println("Duplicate element is: "+a[i]);
                    status = false;
                }
            }
        }
        if(status==true){
            System.out.println("No duplicate element found.");
        }
        //Approch2
        HashSet h = new HashSet();
        for(int l:a){
            if(h.add(l)==false){
                System.out.println("Duplicate element is: "+l);
                status = false;
            }
        }
        if(status==true){
            System.out.println("No duplicate element found.");
        }*/

        HashSet hs = new HashSet();
        for(int value:a){
            hs.add(value);
        }
        System.out.println(hs);
    }
}
