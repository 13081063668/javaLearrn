package javaCode.chapter06;

import java.util.Random;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AI ai= new AI();
        while(true){
            int tom = sc.nextInt();
            ai.play(tom);
        }
    }
}

class AI{
    int AIWin;
    int tomWin;
    public AI(){
        this.AIWin = 0;
        this.tomWin = 0;
    }
    public void show(){
        System.out.println("Tom:AI = " + tomWin + ":" + AIWin);
    }
    public void play(int tom){
        if(tom != 0 &&tom != 1 &&tom != 2){
            System.out.println("请输入0-2");
        }
        int ai = new Random().nextInt(3);
        if(tom == ai){
            System.out.println("平局");
            show();
        }else if(tom == 0){
            switch (ai) {
                case 1:
                    tomWin++;
                    show();
                    break;
                case 2:
                    AIWin++;
                    show();
                    break;
            }
        }else if(tom == 1){
            switch (ai) {
                case 2:
                    tomWin++;
                    show();
                    break;
                case 0:
                    AIWin++;
                    show();
                    break;
            }
        }else if(tom == 2){
            switch (ai) {
                case 0:
                    tomWin++;
                    show();
                    break;
                case 1:
                    AIWin++;
                    show();
                    break;
            }
        }
    }
}