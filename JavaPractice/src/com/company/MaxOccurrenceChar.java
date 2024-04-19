package com.company;

public class MaxOccurrenceChar {

    public static void main(String args[]){

        String s = "My name is Khushbu Vachhani";

        int value = s.length() - s.replace("h","").length();

        System.out.println("Number occurence of h is: " +value);
    }
}
