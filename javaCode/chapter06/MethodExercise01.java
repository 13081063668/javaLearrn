package javaCode.chapter06;

import java.util.Scanner;

public class MethodExercise01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            AAA aa = new AAA();
            for(int i=0;i<n;i++){
                if(aa.judge(i)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
        }
    }
}

class AAA{
    public boolean judge(int n){
        return n % 2 == 0;
    }
}
