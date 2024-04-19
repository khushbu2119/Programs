package com.company;

public class funInterface {
    public static void main(String args[]){
        //Normal approach
        funInterfaceImplementingClass f = new funInterfaceImplementingClass();
        System.out.println(f.sum(3,5));

        //anonymous inner class
        sumInterface s1 = new sumInterface() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(f.sum(1,5));

        //lamda
        sumInterface s2 = (a, b) -> a + b;      //lamda internally creates anonymous inner class of functional interface
        System.out.println(s2.sum(1,3));
    }
}

interface sumInterface {
    int sum(int a, int b);
}

class funInterfaceImplementingClass implements sumInterface {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}