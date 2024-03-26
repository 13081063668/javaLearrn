import java.util.Scanner;
public class Homework05 {
    public static void main(String[] args){
        int arr[] = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("====顺序输出====");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("====倒序输出====");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[arr.length - i - 1] + "\t");
        }
        System.out.println();
        int sum = 0;
        double avg;
        int maxNum = arr[0];
        int maxIdx = 0; 
        for(int i = 0; i < 10; i++){
            sum += arr[i];
            if(arr[i] > maxNum){
                maxIdx = i;
                maxNum = arr[i];
            }
        }
        System.out.println("平均值为" + (sum / 10.0));
        System.out.println("最大值为" + maxNum);
        System.out.println("最大值下标为" + maxIdx);
        // 查找数组中是否有n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = -1;
        for(int i = 0; i < 10; i++){
            if(n == arr[i]){
                
                idx = i;
                break;
            }
        }
        if(idx == -1){
            System.out.println("没找到");
        }else{
            System.out.println("找到了");
        }

    }
}
