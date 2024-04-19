package com.company;

public class GetterSetter {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(2);
        System.out.println(e.getId());
    }


}

class Employee {
    private int id;
    String name;

    public int getId(){
        return id;
    }
    public void setId(int id){
         this.id = id;
    }
}
