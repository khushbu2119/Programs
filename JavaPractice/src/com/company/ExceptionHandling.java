package com.company;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String args[]) {
       ExceptionHandling.checkAge();
    }
    public static void checkAge() {
        int age = 2;
        if(age<18){
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
