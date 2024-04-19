package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int a[]={13,7,9,11,15,1};
        int n= a.length;
        int temp = 0;
        System.out.println("Before sorting: " + Arrays.toString(a));
        for(int i=0; i<n-1; i++){     //
            for(int j=0; j<n-1; j++){
                if(a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting: " + Arrays.toString(a));

        //It will compare element of array one by one> 13 and 7 > if a[0]>a[i] then swap numbers > 7,13,9,11,15,1
        //now 13 and 9 > 13>9 so swap number > 1,9,13,11,15,1
    }
}
