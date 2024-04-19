package com.company;

public class SearchEleInArray {
    public static void main18(String args[]){
        int a[]={10,8,5,13,17,20};
        int search_ele= 113;
        boolean flag= true;
        for(int value:a){
            if(value==search_ele){
                System.out.println("Element " +search_ele+ " present in array");
                flag= false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Element " +search_ele+ " not present in array");
        }
    }
}
