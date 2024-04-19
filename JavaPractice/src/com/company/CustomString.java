package com.company;

public class CustomString {
    public static void main(String[] args) {
        String s1 = "Automation Engineer";
        String s2 = "Khushbu";
        StringBuilder s3 = new StringBuilder();
        for(int i = 0; i<Math.max(s1.length(),s2.length()); i++){
             char c1 = i<s1.length() ? s1.charAt(i) : ' ';
            char c2 = i<s2.length() ? s2.charAt(i) : ' ';
            s3.append(c1).append(c2);
        }
        System.out.println(s3);
    }
}
