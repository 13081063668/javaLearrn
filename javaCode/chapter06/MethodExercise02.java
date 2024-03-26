package javaCode.chapter06;

public class MethodExercise02 {
    public static void main(String[] args) {
        PersonA p1 = new PersonA();
        p1.name = "name";
        p1.age = 11;
        PersonA p2 = new MyTools().copyPerson(p1);
        p2.print();
    }
}

class PersonA{  
    String name;
    int age;
    void print(){
        System.out.println("name: " + name + ", age: " + age);
    }
}
class MyTools{
    public PersonA copyPerson(PersonA copy){
        PersonA newPerson = new PersonA();
        newPerson.name = copy.name;
        newPerson.age = copy.age;
        return newPerson;
    }
}