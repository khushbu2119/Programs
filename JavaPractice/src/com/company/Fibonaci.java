package com.company;

public class Fibonaci {
    public static void main11(String args[]){
        int n1=0, n2=1, sum=0;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=0; i<15; i++){
            sum = n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
}
