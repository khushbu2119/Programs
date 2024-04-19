package com.company;

public class ReverseString {
    public static void main(String args[]){
        String s = "ABCD";
        int len = s.length();
        String rev = "";
        StringBuilder s1 = new StringBuilder();

        //Normal way
        for(int i= len-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        System.out.println(rev);

        //Proper way
        for(int i = s.length()-1; i>=0; i--){
            s1.append(s.charAt(i));
        }
        System.out.println(s1.toString());

        //By using array
        char a[] = s.toCharArray();
        for(int i = len-1; i>=0; i--){
            rev = rev + a[i];
        }
        System.out.println(rev);

        //Using stringBuffer
        StringBuffer sb = new StringBuffer(s);
        StringBuffer sb_rev = sb.reverse();
        System.out.println("Reverse string : " +sb_rev);


    }
}
