package com.threads;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//	   new Thread(()-> {
//	       System.out.println("Printing from runnable");
//           System.out.println("This is line 2");
//           System.out.format("This is line %d\n", 3);
//	   }).start();

        Employee john = new Employee("John Doe", 30);
        Employee greg = new Employee("Greg Rutkowski", 32);
        Employee marta = new Employee("Marta Florczak", 29);
        Employee snow = new Employee("John Snow", 100);
        Employee red = new Employee("Red Riding Hood", 25);
        Employee charming = new Employee("Prince Charming", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(greg);
        employees.add(marta);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        System.out.println("Employees over 30");
        System.out.println("=================");

        employees.forEach(employee -> {
            if(employee.getAge() >30){
                System.out.println(employee.getName());
            }
        });

//        for(Employee employee: employees){
//            if(employee.getAge() > 30){
//                System.out.println(employee.getName());
//            }
//        }
//
//        employees.forEach(employee -> {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        });
    }
}

