package com.company;

public class TypesOfVariables {

    int instanceValue;
    static int staticValue;

    public static void main31(String[] args) {
        int localVariable = 0;
        TypesOfVariables a = new TypesOfVariables();
        System.out.println(a.instanceValue);
        System.out.println(staticValue);
        System.out.println(localVariable);
    }
}
