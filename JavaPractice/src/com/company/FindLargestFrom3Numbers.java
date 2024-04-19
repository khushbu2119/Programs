package com.company;

public class FindLargestFrom3Numbers {
    public static void main10(String args[]){
        int a=6, b=3, c=5;
        if (a>b && a>c){
            System.out.println("Largest:" +a);
        }else if (b>a && b>c){
            System.out.println("Largest:" +b);
        }else if (c>a && c>b){
            System.out.println("Largest:" +c);
        }

        int largest1 = a>b?a:b;
        int largest2 = c>largest1?c:largest1;
        System.out.println("Largest" +largest2);
    }
}
