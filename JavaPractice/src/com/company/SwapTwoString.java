package com.company;

public class SwapTwoString {
    public static void main(String args[]){
        String A = "Hexaware";
        String B = "Mobiquity";
        System.out.println("Before swap A : " +A+ " B : " +B);
        A = A + B;
        B = A.substring(0, A.length()-B.length()); //
        A = A.substring(B.length());
        System.out.println("After swap A : " +A+ " B : " +B);
    }
}
