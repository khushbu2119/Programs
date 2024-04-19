package com.company;

public class SumOfOddEvenNumbers {
    public static void main(String args[]){
        int[] arr={1,3,4,5,6};
        int sum_of_odd=0, sum_of_even=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                sum_of_even=sum_of_even+arr[i];
            }
            else{
                sum_of_odd=sum_of_odd+arr[i];
            }
        }
        System.out.println("Sum of odd numbers: " +sum_of_odd);
        System.out.println("Sum of even numbers: " +sum_of_even);
    }
}
