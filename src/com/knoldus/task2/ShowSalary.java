package com.knoldus.task2;




// creating address data type
class Address {
    String house_name;
    String city;
    String zipCode;

    public Address(String house_name, String city, String zipCode) {
        this.house_name = house_name;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String toString() {
        return house_name + ", " + city + ", " + " " + zipCode;
    }
}


class Member {
    String name;
    int age;
    String phone_number;
    Address address;
    double salary;

    public Member(String name, int age, String phone_number, Address address, double salary) {
        this.name = name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {

        System.out.println(salary);
    }
}

class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phone_number, Address address, double salary, String specialization) {
        super(name, age, phone_number, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member {
    String department;

    public Manager(String name, int age, String phone_number, Address address, double salary, String department) {
        super(name, age, phone_number, address, salary);
        this.department = department;
    }
}

public class ShowSalary {
    public static void main(String[] args) {
        Address employee_address = new Address("Johns", "Manhattan",  "12345");
        Address manager_address = new Address("Sharmas", "Delhi",  "12345");


        Employee employee = new Employee("Riya", 25, "123-456-7890",employee_address, 60000.0, "Marketing");
        Manager manager = new Manager("John", 35, "999-999-9999", manager_address, 75000.0, "Human Resources");

        //Displaying salary of employee
        System.out.println("Salary of the Employee is :" );
        employee.printSalary();
        //Displaying salary of manager
        System.out.println("Salary of the Manager is :" );
        manager.printSalary();


    }
}

