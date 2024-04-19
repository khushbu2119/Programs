package com.company;

public class PalindromString {
    public static void main(String args[]){
        String s = "A";
        String org_value = s;
        int len = s.length();
        String rev = "";

        /*for(int i= len-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }

        if(org_value.equals(rev)){
            System.out.println("Palindrom string");
        }
        else{
            System.out.println("Not a palindrom string");
        }*/
        boolean status = true;
        int start =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                status =  false;
                break;
            }else{
                start++;
                end--;
            }
        }
        if(status){
            System.out.println("palindrom string");
        } else{
            System.out.println("not a palindrom string");
        }
    }
}
