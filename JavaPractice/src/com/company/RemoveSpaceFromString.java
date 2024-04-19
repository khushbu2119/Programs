package com.company;

public class RemoveSpaceFromString {
    public static void main25(String args[]) {
        String s = "    test    string     with remove  ";
        s = s.replaceAll(" ","");
        System.out.println(s);
    }
}
