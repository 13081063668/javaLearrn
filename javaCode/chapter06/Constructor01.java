package javaCode.chapter06;

public class Constructor01 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(1, 2);
        System.out.println(r.length);
        System.out.println(r.width);
    }
}

class Rectangle {
    public int length;
    public int width;
    // 构造器没有返回值，不需要写
    // 构造器的名字与类名相同
    // 形参

    public Rectangle(int l, int w){
        System.out.println("构造器被调用");
        length = l;
        width = w;
    }
}