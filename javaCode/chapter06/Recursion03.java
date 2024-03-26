package javaCode.chapter06;

public class Recursion03 {
    public static void main(String[] args) {
        TT t = new TT();
        System.out.println(t.f(1));
    }
}

class TT{
    public int f(int n){
        if(n >= 1){
            if(n == 1 || n == 2){
                return 1;
            }
            return f(n - 1) + f(n - 2);
        }
        System.out.println("请输入大于1的值");
        return -1;
    }
}