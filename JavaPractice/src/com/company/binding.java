package com.company;

public class binding {
    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.test();
        baleno b = new baleno();
        b.test();
        Vehicle v1 = new baleno();
        v1.test();
        v1.test1();
        System.out.println(Vehicle.d);
        float a =5;
        String s = Float.toString(a);
        System.out.println(s);
        String s1 = String.valueOf(a);
        System.out.println(s1);
    }
}

class Vehicle{
    int a =5;
    static int d =  2;
    public static void test(){
        System.out.println("vehicle");
        int c;
        System.out.println(Vehicle.d);
    }
    public void test1(){
        System.out.println("test1");
        System.out.println(Vehicle.d);
    }
}

class baleno extends Vehicle {
    int b = 5;

    public static void test() {
        System.out.println("baleno");
    }

    public void test2() {
        System.out.println("test2");
    }
}

