package com.company;

public class InterfaceAndAbstractClass {
    public static void main(String[] args) {
        BobAtm b = new BobAtm();
        b.depoistMoney(10);
        BobAtm1 ba = new BobAtm1();
        ba.deposit(12);
    }
}


interface Atm {
    boolean withdrawMoney(int money);
    boolean depoistMoney(int money); // this is abstract method
}

class BobAtm implements Atm {
    public boolean withdrawMoney(int money) {
        return false;
    }
    public boolean depoistMoney(int money) {
        return false;
    }
}

// interface can not be instantiated - can not create object of interface

abstract class Atm1 {
    abstract boolean withdrawMoney(int money);
    boolean deposit(int money){
        int amount = 50;
        amount =- 20;
        return true;
    }
}

class BobAtm1 extends Atm1 {
    boolean withdrawMoney(int money) {
        return false;
    }
}

// interface can have only abstract methods - methods without body
// abstract class can have abstract and non abstract method -

/*
what is abstract methods ?
    abstract methods does not have body, we are just giving definiton, not body.

What is interface ?
    interface has only abstract methods. you can not give method body in interface.

    you can not create object of interface.
    interface will be implemented by class, and class has to give implementation of every interface method.

what is abstract class ?
    abstract class can have abstract and non abstract methods both. some methods have implementation and some does not.

    you can not create objects of abstract class.
    abstract class will be extend by another class. and that class will give implementation of abstract methods.
 */

/*

two types of error -
compile time - when you write the programs or compiles, you get error, its compile time error.
run time - your program compiles correctly, but gives error when you run it, its run time error.
 */