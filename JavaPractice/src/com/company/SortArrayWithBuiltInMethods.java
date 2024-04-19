package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortArrayWithBuiltInMethods {
    public static void main34(String args[]){
        int a[] = {10,30,5,14,22,18}, b[]={10,30,5,14,22,18};
        //Approch1
        System.out.println("Before sorting: " + Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println("After sorting: " +Arrays.toString(a));
        //Approch2
        System.out.println("Before sorting: " + Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("After sorting: " +Arrays.toString(b));
        //Approch3 -- print array in decending order
        Integer c[] = {10,30,5,14,22,18};
        System.out.println("Before sorting: " + Arrays.toString(c));
        Arrays.sort(c, Collections.reverseOrder());    //Collections.reverseOrder() will not work for premitive datatype hence use Integer for c array.
        System.out.println("After sorting reverse order: " +Arrays.toString(c));
    }
}

