package com.company;

public class Test {

    static boolean name;
    String s;

    public static void main(String args[]){
        System.out.println(Test.name);
        int i;
    }

    public void check() {
        System.out.println("super");

    }

    public static void check1() {
        System.out.println("super");

    }

}

class Test2 extends Test{
    String s;
    int x = Integer.MAX_VALUE;

    public void check(){
        super.check();
        check1();
        System.out.println("child");
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.s);
        System.out.println(Test.name);
    }
}
