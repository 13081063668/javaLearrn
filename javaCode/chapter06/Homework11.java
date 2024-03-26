package javaCode.chapter06;

public class Homework11 {
    public static void main(String[] args) {
        MethodTest m = new MethodTest();
        m.call();
    }
}
class MethodTest{
    public double method(double d1, double d2){
        return d1 + d2;
    }
    public void call(){
        System.out.println(method(method(10.0, 20.1), 100.2));
    }
}