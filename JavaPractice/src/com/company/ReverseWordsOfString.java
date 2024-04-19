package com.company;

public class ReverseWordsOfString {
    public static void main(String args[]){
        String a = "My name is khushbu";
        /*StringBuilder reverseString = new StringBuilder();
        System.out.println("Original string is : " +a);
        String words[] = a.split(" ");
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseString.append(sb).append(" ");
        }
        System.out.println("Reverse string is : " +reverseString);*/


        String words[] = a.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word:words){
            for(int i= word.length()-1; i>=0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        System.out.println(sb);
    }
}
