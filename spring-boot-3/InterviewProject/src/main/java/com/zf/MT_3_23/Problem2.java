package com.zf.MT_3_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // abccba
        // 处理输入，转成char数组好用
        int left = 0, right = 0;
        String strs = sc.next();
        char[] chs = strs.toCharArray();
        List<Character> l = new ArrayList<>();
        for(char ch: chs){
            if(l.isEmpty() || l.get(l.size() - 1) != ch){
                l.add(ch);
            }
        }
        System.out.println(l);
        System.out.println(n - l.size());
    }
}
// abcbbc