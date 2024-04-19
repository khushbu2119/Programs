package com.company;

public class Encapsulate1 {
    private int emp_id;
    private String emp_name;

    //To access this private data we will create getter setter methods
    public int getId(){
        return emp_id;
    }

    public String getName(){
        return emp_name;
    }

    public int setId(int id){
        emp_id = id;
        return emp_id;
    }

    public String setName(String name){
        emp_name = name;
        return emp_name;
    }
}
