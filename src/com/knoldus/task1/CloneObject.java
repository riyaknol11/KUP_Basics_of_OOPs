package com.knoldus.task1;


import java.util.Scanner;

class Employees {
    String name;
    int age;

    public Employees(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Employees(Employees employee1) {
        this.name = employee1.name;
        this.age = employee1.age;
    }

}
public class CloneObject {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of employee 1 :");
        String name = input.next();
        System.out.println("Enter the age of employee  1 :");
        int age = input.nextInt();
        Employees employee1 = new Employees(name, age);

        // copying employee1 to employee2..
        Employees employee2 = new Employees(employee1);
        System.out.println("Name of employee 2: " + employee2.name);
        System.out.println("Age of employee 2 : " + employee2.age);
    }
}

