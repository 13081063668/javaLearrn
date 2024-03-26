package javaCode.chapter06;

public class MethedDetail {
    public static void main(String[] args) {
        // 要求返回多个结果
        AA a = new AA();
        for(int i = 0; i < a.getSumAndSub(2, 1).length; i++ ){
            System.out.println(a.getSumAndSub(2, 1)[i]);
        }
        
    }
}

class AA{
    public int[] getSumAndSub(int n1, int n2){
        return new int[]{n1 + n2,n1 - n2};
    }
}