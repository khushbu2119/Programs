package com.company;

public class RemoveJunkSpeCharFromString {
    public static void main(String args[]){
        String s = "Test## !@#$String. 876()98765:.,;p";
        s = s.replaceAll("[^0-9A-Za-z]", "");
        System.out.println(s);
    }
}
