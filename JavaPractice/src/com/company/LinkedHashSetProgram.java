package com.company;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {
    public static void main(String[] args) {

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(100);
        hs.add(200);
        hs.add(300);
        hs.add(400);
        System.out.println(hs);     //[100,200,300,400]

        //All methods mention in HashSet will use here as well

    }
}
