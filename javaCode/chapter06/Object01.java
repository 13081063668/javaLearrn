package javaCode.chapter06;

class Cat{
    int age;
    String name;
    String color;
    Cat(){
        this.age = 0;
        this.name = "Tom";
        this.color = "black";
    }
    Cat(int age, String name, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }
    void print(){
        System.out.println("name: " + name + ", age: " + age + ", color: " + color);
    }
    void eat(){
        System.out.println(name + " is eating");
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }

}

public class Object01{
    public static void main(String[] args){
        System.out.println("hello java");
        // 使用oop
        // 实例化一只猫
        Cat Tom = new Cat(18, "Tom", "black");
        Cat Lisa = new Cat(12, "Lisa", "white");
        Lisa.eat();
        Tom.print();
    }
}