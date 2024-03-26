package javaCode.chapter06;

public class Recursion02 {
    public static void main(String[] args) {
        System.out.println(factorual(5));
    }
    public static int factorual(int n){
        if(n == 1){
            return n;
        }
        return n * factorual(n - 1);
    }
    
}
