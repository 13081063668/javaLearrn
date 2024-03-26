package javaCode.chapter06;

public class Homework13 {
    public static void main(String[] args) {
        NewCircle c = new NewCircle(9);
        PassObject po = new PassObject();
        po.printAreas(c, 5);
    }
}

class NewCircle{
    double radius;
    public NewCircle(double r){
        radius = r;
    }
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
class PassObject{
    public void printAreas(NewCircle c, int times){
        for(int i = 0; i < times; i++){
            System.out.println((i + 1) + "半径的圆的面积为" + new NewCircle(i + 1).findArea());
        }
        System.out.println(c.findArea());
    }
}