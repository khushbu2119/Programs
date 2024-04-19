package com.company;

public class FindSumOfArray {
    public static void main14(String args[]){
        int a[] = {3,5,2,8,4};
        int len = a.length, sum =0;
        for (int i=0; i<a.length; i++){
            sum = sum +a[i];
        }

        for(int value:a){
            sum=sum+value;
        }
        System.out.println("Sum: " +sum);
    }
}
