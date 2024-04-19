package com.company;

public class FindMinMaxFromArray {
    public static void main17(String args[]){
        int a[]={10,6,9,13,2};
        int max=a[0], min=a[0];
        for (int i=1; i<a.length; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("Max number is: " +max);
        for (int i=1; i<a.length; i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("Min number is: " +min);
    }
}
