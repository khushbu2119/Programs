package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListProgram {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);

        list = new LinkedList<>();

        for(int list_value : list){
            System.out.println(list_value);
        }

        List<String> string = new ArrayList<>();
        string.add("Khushbu");
        string.add("Dipen");

        for(int i =0 ; i<string.size(); i++){
            System.out.println(string.get(i));
        }

        System.out.println(list.get(2));

        //Allows to add dublicate values in list
        //It stores data in sequence so we can get it from index like .get(0)
        //Default capacity is 10
    }
}
