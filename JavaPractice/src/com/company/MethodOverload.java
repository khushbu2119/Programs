package com.company;

public class MethodOverload {
    public static void main(String[] args) {
        B a = new B();
        a.sum(2,5);

        A a1 = new A();
        a1.sum(2,5);

        A a2 = new B();
        a2.sum(2,5);
    }

}
class A{
     int sum(int a,int b){
        System.out.println("A");
        return a+b;
    }
}
class B extends A{
     int sum(int a,int b) {
        System.out.println("B");
        return a + b;
    }
}