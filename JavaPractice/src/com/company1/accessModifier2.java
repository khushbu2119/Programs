package com.company1;

import com.company.accessModifier;

public class accessModifier2 extends accessModifier{

    public static void main(String args[]){
        accessModifier2 ac= new accessModifier2();
        System.out.println(ac.id);
        //System.out.println(ac.name);
    }
}

class accessModifier3 {
    public static void main(String[] args){
        accessModifier a = new accessModifier();
        System.out.println(a.id);
    }
}
