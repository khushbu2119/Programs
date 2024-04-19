package com.company;

public class BinarySearch {
    public static void main(String args[]){
        int a[] = {23,4,5,78,9,87,45,32,56,7,21};
        int key = 70;
        int l = 0;
        int h = a.length-1; //7
        boolean flag =  true;

        while(l<=h){
            int m = (l+h)/2;  //0+7/2=3
            if(a[m]==key){
                System.out.println("Element found " +key+ " at position " +(m+1) );
                flag = false;
                break;
            }
            if(a[m]<key){
                l = m+1;
            }
            if(a[m]>key){
                h = m -1;
            }
        }
        if (flag == true){
            System.out.println("Element not found");
        }

        //First we need to find middle variable and then check key is greater of lesser.
        //If key is greater than middle value then go with left --> side and if its less than mid than go on right side<--
    }
}
