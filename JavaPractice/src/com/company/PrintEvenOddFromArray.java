package com.company;

public class PrintEvenOddFromArray {
    public static void main14(String args[]){
        int a[]= {5,7,9,2,3,5,8};
        for(int i=0; i<a.length; i++){
            if (a[i]%2 == 0){
                System.out.println("Even number: " +a[i]);
            }
            else{
                System.out.println("Odd number: " +a[i]);
            }
        }
        for(int value:a){
            if(value%2 == 0){
                System.out.println("Even number: " +value);
            }else{
                System.out.println("Odd number: " +value);
            }
        }
    }
}
