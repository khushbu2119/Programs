package com.company;

public class CountOccuranceOfCharInString {
    public static void main(String args[]){
        String s = "My name is khushbu Khanpara";
        String new_s = s.replace("k","");
        System.out.println(new_s);
        int count = 0;
        count = s.length()-new_s.length();
        System.out.println("number occurance of k is: " +count);
    }
}
