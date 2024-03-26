package com.zf.MT_3_23;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n + 1];
        for(int i = 1; i <= n; i++){
            arrs[i] = sc.nextInt();
        }
        String strs = sc.next();
        char[] chs = new char[n + 1];
        for(int i = 1; i <= n; i++){
            chs[i] = strs.charAt(i - 1);
        }
        double cnt = 0;
        for(int i = 1; i <= n; i++){
            if(chs[i] == 'W'){
                if(arrs[i] != i){
                    System.out.println(-1);
                    return;
                }
            }else{
                if(arrs[i] != i){
                    int tmp = arrs[i];
                    arrs[arrs[i]] = arrs[i];
                    arrs[i] = tmp;
                    cnt += 1;
                }
            }
        }
        System.out.println(Math.round(cnt));
    }
}
// 4 3 2 1
// 1 3 2 4
// 1 2 3 4

// 3 2 1
// 1 2 3

// 3 1 2
// 1 3 2
// 1 2 3

// 8 3 4 2 6 7 1 5
// 1 3 4 2 6 7 8 5
// 1 2 4 3 6 7 8 5
// 1 2 3 4 6 7 8 5
// 1 2 3 4 5 7 8 6
// 1 2 3 4 5 6 8 7
// 1 2 3 4 5 6 7 8
