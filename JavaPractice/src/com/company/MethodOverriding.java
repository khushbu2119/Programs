package com.company;

public class MethodOverriding extends accessModifier{

    public void login(String username, String password){
        System.out.println("Login with username and password");
    }

    public void login(int phoneNumber, String password){
        System.out.println("Login with phone number and password");
    }

    public static void main(String args[]){
        MethodOverriding mo = new MethodOverriding();
        mo.login(99898, "pwd");
        mo.login(1234,"pwd",123);
    }
}
