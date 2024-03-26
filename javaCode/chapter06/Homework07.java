package javaCode.chapter06;

public class Homework07 {
    public static void main(String[] args) {
        
    }
}

class NewDog{
    String name;
    String color;
    int age;
    NewDog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
    }
}