package javaCode.chapter06;

public class VarParameter {
    public static void main(String[] args) {
        Var v = new Var();
        System.out.println(v.sum(0,1,2,3));;
    }
}

class Var{
    // 可以接收多个int 0-多
    // 使用参数的时候，可以将nums看作是数组
    public int sum(int... nums){
        int sum = 0;
        for(int i = 0;i < nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
}