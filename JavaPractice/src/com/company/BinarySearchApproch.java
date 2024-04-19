package com.company;

import java.util.Arrays;

public class BinarySearchApproch {
    public static void main(String args[]){
        int a[]={23,4,5,78,9,87,45,32,56,7,21};
        Arrays.sort(a);
        int key=45;
        int low=0, mid;
        int highest= a.length-1;
        boolean flag =  true;
        while(low<=highest){
            mid = (low + highest)/2;
            if(a[mid]==key){
                System.out.println("Element " +key+ " found in array");
                flag = false;
                break;
            }
            if(a[mid]<key){
                low = mid+1;
            }
            if(a[mid]>key){
                highest = mid-1;
            }
        }
        if(flag==true){
            System.out.println("Element not found in array");
        }
    }
}
