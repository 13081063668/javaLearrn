package javaCode.chapter06;

public class Homework12 {
    public static void main(String[] args) {
        
    }
}

class Employee{
    String name;
    int age;
    String gender;
    String department;
    double salary;
    public Employee(String name, int age, String gender, String department, double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }
    public Employee(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Employee(String department, double salary){
        this.department = department;
        this.salary = salary;
    }
}
