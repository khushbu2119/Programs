package com.company;

public class student {

    public student(int id, String name){
        System.out.println("Inside the constructor");
        System.out.println("id>" +id +" " + "name>" +name);
    }
    static int a  = 5;
    public static void main(String args[]){

        student s = new student(1, "Khushbu");
        System.out.println("main block");
    }
}

class Animal{
    public void sound(){

    }
}


