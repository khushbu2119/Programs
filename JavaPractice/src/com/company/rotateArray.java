package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class rotateArray {

        public static void main(String args[]) {
            /*String s1 = "elephant";
            int vCount = 0, cCount = 0;
            for(int i=0; i<s1.length(); i++){
                char ch = s1.charAt(i);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vCount++;
                } else{
                    cCount++;
                }
            }
            System.out.println("Total vowels: " + vCount + " Total consonent: " + cCount);*/


            /*String s1 = "racqe";
            String s2 = "carew";
            HashMap<Character, Integer> hs1 = new HashMap<>();
            HashMap<Character, Integer> hs2 = new HashMap<>();
            if(s1.length() == s2.length()){
                for(int i=0; i<s1.length(); i++){
                        hs1.put(s1.charAt(i), hs1.getOrDefault(s1.charAt(i), 0)+1);
                }
                for(int i=0; i<s2.length(); i++){
                        hs2.put(s2.charAt(i), hs2.getOrDefault(s2.charAt(i), 0)+1);
                }
                for(char value:hs1.keySet()){
                    if(hs1.get(value) != hs2.get(value)){
                        System.out.println("not a anagram");
                        break;
                    }
                    else{
                        continue;
                    }
                }

            } else{
                System.out.println("not a anagram");
            }*/

            String s = "test12qa34check";
            int j;
            StringBuilder rev = new StringBuilder();
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    j = i;
                    System.out.println(s.charAt(i));
                    System.out.println(i + " " + j);
                    for(int k = j-1; k >= j ; k--){
                        rev.append(s.charAt(j));
                    }
                    rev.append(s.charAt(i));
                }
                System.out.print(rev.toString());
            }

        }
}