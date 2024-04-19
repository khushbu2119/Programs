package com.company;

public class SwapTwoNumbers {
    public static void main1(String args[]){
        int a = 30;
        int b = 50;
        int temp;
        System.out.println("Before swap a=> " +a + " b => " +b);

        //Logic1 with third variable
        temp = a;
        a=b;
        b=temp;
        System.out.println("After swap a=> " +a + " b => " +b);

        //logic2 without third variable with + and -
        a= a+b; //a=80;
        b = a-b; //80-50=30
        a= a-b;  //80-30=50
        System.out.println("After swap a=> " +a + " b => " +b);

        //Logic3 without third variable with * and /
        a= a*b; //a=150;
        b = a/b; //150/50=30
        a= a/b;  //150/30=50
        System.out.println("After swap a=> " +a + " b => " +b);

        //Logic4 with bitwise XOR
        a = a^b; //a=60
        b = a^b; //60^50=30
        a = a^b; //60^30=50
        System.out.println("After swap a=> " +a + " b => " +b);

        //Logic5 in single statement
        b = a+b - (a=b); //Execute from left to right so a=b=50 and b=80-50=30
        System.out.println("After swap a=> " +a + " b => " +b);
    }
}
