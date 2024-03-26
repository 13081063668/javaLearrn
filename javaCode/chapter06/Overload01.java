package javaCode.chapter06;

public class Overload01 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println("100");
        System.out.println(new Cal().calculate(1, 1));
        System.out.println(new Cal().calculate(1.1, 1));
        System.out.println(new Cal().calculate(1, 1.1));
        System.out.println(new Cal().calculate(1, 1,2));
        new Methods().m(2);
        new Methods().m(2,3);
        new Methods().m("sss");
    }
}
class Methods{
    public void m(int n){
        System.out.println("平方 = " + (n * n));
    }
    public void m(int n1,int n2){
        System.out.println("和 = " + (n1 + n2));
    }
    public void m(String s){
        System.out.println("字符串 = " + s);
    }
    

}
class Cal{
    public int calculate(int a, int b){
        return a + b;
    }
    // public double calculate(int a, int b){
    //     return a + b;
    // }
    public double calculate(double a, int b){
        return a + b;
    }
    public double calculate(int a, double b){
        return a + b;
    }
    public int calculate(int a, int b, int c){
        return a + b + c;
    }
}