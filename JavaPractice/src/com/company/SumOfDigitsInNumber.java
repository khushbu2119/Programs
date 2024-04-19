package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.xsom.impl.scd.Step;

import java.util.Arrays;
import java.util.HashMap;

public class SumOfDigitsInNumber {
    public static void main(String args[]){
        /*int num = 12345;
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("sum : "+sum);*/

        /*String s1 = "Test";
        String s2 = "Test";
        String s3 = new String("Test");
        String s4 = new String("Test");

        if(s1==s2){
            System.out.println("String match s1 and s2");
        }
        if(s3==s4){
            System.out.println("String match s3 and s4");
        }
        if(s1.equals(s2)){
            System.out.println("String reference match for s1 and s2");
        }
        if(s3.equals(s4)){
            System.out.println("String reference match for s3 and s4");
        }*/


        int[] a = {12, 14, 15, 17, 18, 18, 19, 20, 18, 14};
        Arrays.sort(a);
        int count=1;
        // Traverse the sorted array to find duplicates
        for (int i = 0; i < a.length-1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println("Duplicate element: " + a[i] + ", Count: " + count);
                }
                count = 1;
            }
        }

    }
}
