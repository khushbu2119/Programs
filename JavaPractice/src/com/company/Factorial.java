package com.company;

public class Factorial {
    public static void main(String args[]){
        int num = 5, fac = 1, fact=1;
        for (int i = 1; i<=num ; i++){
            fac =  i * fac;
        }
        System.out.println("Factorial: "+fac);
        for(int j=num; j>=1;j--){
            fact = fact * j ;
        }
        System.out.println(fact);
    }
}
