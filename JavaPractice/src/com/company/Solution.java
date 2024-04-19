package com.company;

public class Solution {
    public static void main(String[] args) {
        int number = 8;
        number += ++number;
        System.out.println(++number);
        Solution s = new Solution();
        System.out.println("Given number is prime? > " +s.reverseNumber(number));
    }
    public int reverseNumber(int number) {
     StringBuilder sb = new StringBuilder();
     sb.append(number).reverse();
     String s = sb.toString();
     int rev = Integer.valueOf(s);
     return rev;
    }
}
