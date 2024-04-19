package com.company;

public class PrimeNumber {

    public static void main(String args[]){

        //Below pragram is used to check given number is prime number or not
        int number = 4;
        int count = 0;

        /*if(number>1){
            for (int i=1; i<=number; i++){
                if(number%i == 0)
                    count++;
            }
            if(count == 2)
                System.out.println("Prime number");
            else
                System.out.println("Not a prime number");
        }
        else{
            System.out.println("Not a prime number");
        }*/

        //Below program is used to print prime number series
        int num = 10;
        for(int i = 2; i<=num; i++){
            boolean prime = true;
            for(int j=2; j<i; j++){
                if (i%j == 0){ // here we are checking if given number is divide by any other number except 1 and number itselft
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println(i);
            }
        }
    }
}
