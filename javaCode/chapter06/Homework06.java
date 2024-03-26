package javaCode.chapter06;

public class Homework06 {
    public static void main(String[] args) {
        
    }
}
class Cale{
    double n1;
    double n2;
    public Cale(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public double getSum(){
        return n1 + n2;
    }
    public double getDiff(){
        return n1 - n2;
    }
    public double getMul(){
        return n1 * n2;
    }
    public double getDiv(){
        if(n2 == 0){
            System.out.println("除数不可为零");
            return -1;
        }
        return n1 / n2;
    }
}