package com.company;

public class ReverseEachWordInString {
    public static void main(String args[]){
        String s = "My name";
        String rev = "", reverseString="";
        String words[] = s.split(" ");
        System.out.println("Original string: " +s);
        //Approch1
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
            rev = rev + sb.reverse()+" ";
        }
        System.out.println("Reverse string: "+rev);
        //Approch2
        for(String w:words){
            String reverseWord="";
            for (int j = w.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + w.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println("Reverse String: " +reverseString);

        //Proper way using stringbuilder
        StringBuilder rs = new StringBuilder();
        for(String word:words){
            for(int i = word.length()-1; i>=0; i--){
                rs.append(word.charAt(i));
            }
            rs.append(" ");
        }
        System.out.println(rs.toString());
    }
}
