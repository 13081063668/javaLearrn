package javaCode.chapter06;


public class ConstructorDetail {
    public static void main(String[] args) {
        ConDetail c1 = new ConDetail("king", 20);
        ConDetail c2 = new ConDetail("tom", 30);
        Dog dog1 = new Dog("tom", 2);
        System.out.println(c1.age + " " + c1.name);
        System.out.println(dog1.hashCode());
    }
}

class Dog{
    String name;
    int age;
    public Dog(String n, int a){
        name = n;
        age = a;
        System.out.println(this.hashCode());
    }
}

class ConDetail{
    String name;
    int age;
    public ConDetail(String name, int age){
        this.name = name;
        this.age = age;
    }
    public ConDetail(){
        name = "default";
        age = 0;
    }
}