package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeTest {

    int id;
    String name;
    int age;

    EmployeeTest(int id, String name, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public static void main(String args[]){
        EmployeeTest e1 = new EmployeeTest(1, "Dipen", 28);
        EmployeeTest e2 = new EmployeeTest(2, "Khushbu", 28);
        EmployeeTest e3 = new EmployeeTest(3, "Dipen1", 28);

        ArrayList<EmployeeTest> emp = new ArrayList<>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

       /* for(EmployeeTest e:emp){
            System.out.println(e.id);
            System.out.println(e.name);
            System.out.println(e.age);
        }*/

        int id = 2;
        String name;
        for(EmployeeTest e:emp) {
            if (e.id == id){
                name = e.name;
                System.out.println(name);
            }
        }

        HashMap<Integer, EmployeeTest> empMap = new HashMap<>();
        empMap.put(e1.id, e1);
        empMap.put(e2.id, e2);

        EmployeeTest e4 = empMap.get(id);
        System.out.println("Employee details : " + e4.id + " " + e4.name + " " + e4.age);

    }
}
