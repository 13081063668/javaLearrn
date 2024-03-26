package javaCode.chapter06;

public class Recursion04 {
    public static void main(String[] args) {
        System.out.println(new TTT().peach(10));
    }
}
class TTT{
    public int peach(int n){
        if(n > 1){
            return peach(n - 1) * 2 + 1;
        }
        return 1;
    }
}