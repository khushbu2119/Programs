package com.company;

import java.util.Scanner;

public class ReverseNumber {
    private StringBuffer sb_rev;

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        int rev=0;

        //Logic1
        while(number!=0){
            rev = rev*10 + number%10;
            number = number/10;
        }
        System.out.println("Reverse number: " +rev);

        //Logic2
        StringBuffer sb = new StringBuffer();
        sb.append(number);
        StringBuffer sb_rev = sb.reverse();
        System.out.println("Reverse number: " +sb_rev);

        //Logic3
        StringBuilder stb = new StringBuilder(String.valueOf(number));
        StringBuilder stb_rev = stb.reverse();
        System.out.println("Reverse number: " +stb_rev);

    }
}
