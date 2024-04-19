package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MapProgram {
    public static void main(String args[]){

        Map<Integer,String> empData =  new HashMap<>();
        empData.put(1,"Khushbu");
        empData.put(2,"Dipen");
        empData.put(1, "khushbu1");

        System.out.println(empData);
        System.out.println(empData.get(1));

        //If we assign same key then it will replase the value
        //Map<Integer,String> -- here Integer and String both are class so we can use any class here also we can directly provide list in argument
        //Like  Map<Integer,List<String>> map = new HashMap<>();

      /*  Map<Integer,List<String>> map = new HashMap<>();
        map.put(1, List.of("Dipen","Deep","Kinjal"));
        map.put(2, List.of("Khushbu","Deep","Kinjal"));*/
    }

}
