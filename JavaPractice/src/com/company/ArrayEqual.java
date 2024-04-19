package com.company;

import java.util.Arrays;

public class ArrayEqual {
    public static void main(String args[]){
        int a[]= {1,2,3,4,5};
        int b[]= {1,2,8,4,5};
        /*boolean status = Arrays.equals(a,b);
        if(status==true){
            System.out.println("Arrays are equal.");
        }else{
            System.out.println("Arrays are not equal.");
        }
        boolean status1 = true;
        if(a.length == b.length){
            for(int i =0; i<a.length; i++){
                if(a[i] != b[i]){
                    status1 = false;
                    break;
                }
            }
        }else{
            status1 = false;
        }
        if(status1==true){
            System.out.println("Arrays are equal.");
        }else{
            System.out.println("Arrays are not equal.");
        }
        System.out.println(arrayEqual(a, b));*/
    }

    /*public static boolean arrayEqual(int a[], int b[]) {
        boolean flag = true;
        if(a.length == b.length){
            for(int i =0; i<a.length; i++){
                if(a[i] != b[i]){
                    flag = false;
                    break;
                }
            }
        }else{
            flag = false;
        }
        if(flag==true){
            System.out.println("Arrays are equal.");
            return flag;
        }else{
            return false;
        }
    }*/

    public static void arrayReverse(int a[]){
        int start = 0;
        int end = a.length -1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] =  temp;
            start++;
            end--;
        }
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
