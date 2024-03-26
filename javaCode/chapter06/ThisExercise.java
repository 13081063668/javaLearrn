package javaCode.chapter06;

public class ThisExercise {
    public static void main(String[] args) {
        Y y1 = new Y("yyf",  30);
        Y y2 = new Y("yyf",  20);
        if(y1.compareTo(y2)){
            System.out.println("两个是一个人");
        }else{
            System.out.println("不是一个人");
        }

    }
}

class Y{
    String name;
    int age;
    public Y(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Y y){
        
        return this.age == y.age && this.name.equals(y.name);
    }
}