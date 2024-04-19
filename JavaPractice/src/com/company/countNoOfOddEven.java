package com.company;

public class countNoOfOddEven {
    public static void main(String args[]){
        int num = 12345;
        int odd=0,even=0;
        while(num!=0){
            int rem = num%10;
            if(rem%2 == 0){
                even++;
            }
            else{
                odd++;
            }
            num = num/10;
        }
        System.out.println("Even :" +even);
        System.out.println("Odd: " +odd);
    }
}
