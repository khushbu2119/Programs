package com.company;

public class SwapString {

    public static void main2(String[] args) {

        String s1 = "Test";
        String s2 = "Java";

        System.out.println("String before swap s1 => " +s1  + " s2 => " +s2);

        s1 = s1 + s2;  // s1= TestJava
        s2 = s1.substring(0, s1.length()-s2.length());  //8-4  Test
        s1 = s1.substring(s2.length()); //java

        System.out.println("String after swap s1 => " +s1  + " s2 => " +s2);

    }
}
