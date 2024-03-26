package javaCode.chapter06;

public class Homework01 {
    public static void main(String[] args) {
        double []a = {2.2,3.2,9};
        System.out.println(new A01().max(a));
    }
}
class A01{
    public double max(double ...nums){
        if(nums.length < 1){
            return -1;
        }
        double maxNum = nums[0];
        for(int i = 1; i < nums.length; i++){
            maxNum = Math.max(maxNum, nums[i]);
        }
        return maxNum;
    }
}
