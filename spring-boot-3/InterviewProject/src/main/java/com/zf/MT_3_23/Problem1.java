package com.zf.MT_3_23;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] strs = new String[n];
        // 处理输入
        for(int i = 0; i < n; i++) strs[i] = sc.next();
        int res = 0;
        // 暴力 四个格子
        for(int i = 0;i < n - 1; i++){
            for(int j = 0; j < m - 1; j ++){
                // 相加等于2
                if(strs[i].charAt(j) + strs[i].charAt(j + 1) + strs[i + 1].charAt(j) + strs[i + 1].charAt(j + 1) - 4 * '0' == 2){
                    res += 1;
                }
            }
        }
        System.out.println(res);
    }
}
