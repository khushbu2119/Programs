package com.company;

import java.util.Random;

public class GenerateRandomString {
    public static void main20(String args[]){
        //Approch1
        Random r = new Random();
        int r_int = r.nextInt(100); //Print number between 0 to 99
        System.out.println(r_int);

        double r_double = r.nextDouble(); //Range 0.0 and less than 1.0
        System.out.println(r_double);

        //Approch2
        System.out.println(Math.random());

        //Approch3
        //Need to add jar http://commons.apache.org/
        /*String randomNum = RandomStringUtils.randomNumeric(10);
        System.out.println(randomNum);*/

    }

}
