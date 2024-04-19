package com.company;

public class CountWordInString {
    public static void main99(String args[]){
        byte b = 5;
        short sh = 1000;
        int in = 20000;
        long l = 12345678;
        float f = 5.5f;
        double d = 1.10;
        char c = 'A';
        boolean b1 = true;

        String s="My name is khushbu khanpara";
        int count=1;

        for(int i=0; i<s.length()-1; i++){
            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Number of word in string is : " +count);
    }
}
