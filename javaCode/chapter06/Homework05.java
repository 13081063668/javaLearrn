package javaCode.chapter06;

public class Homework05 {
    public static void main(String[] args) {
        Circle c1 = new Circle(3);
        System.out.println("c1的周长：" + c1.getPerimeter());
        System.out.println("c1的面积：" + c1.getArea());
    }
}

class Circle{
    double r;
    public Circle(double r){
        this.r = r;
    }
    public double getPerimeter(){
        return 2 * Math.PI * r;
    }
    public double getArea(){
        return Math.PI * r * r;
    }
}