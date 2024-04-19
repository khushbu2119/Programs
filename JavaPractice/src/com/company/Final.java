package com.company;

public class Final {
    int id = 1;
    static String name = "khushbu";

    static final void eat(){
        System.out.println("eat");
    }

    void bark(){
        System.out.println("bark");
    }
}

class test12 extends Final{
    public static void main(String args[]){
        Final f = new Final();
        System.out.println(f.id);
        Final.eat();
    }
}
