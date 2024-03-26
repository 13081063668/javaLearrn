package javaCode.chapter06;

public class Homework04 {
    public static void main(String[] args) {
        
    }
}
class A04{
    public int[] copyArr(int []arr){
        int[] newArr = new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
