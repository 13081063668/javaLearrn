package javaCode.chapter06;

public class PropertiesDetail {
    
    public static void main(String[] args) {
        // 创建Person对象
        // p1 是对象名（对象引用）
        // new Person() 创建的对象空间才是真正都得对象
        Person p1 = new Person();
    }
}

class Person{
    private String name;
    private int age;
    private boolean isPass;
    private double sal;
    Cat cat;
}