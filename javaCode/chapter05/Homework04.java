import java.util.Scanner;
public class Homework04 {
    public static void main(String[] args){
        int arr[] = {10, 12, 45, 90};
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arrNew = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            if(flag){
                if(arr[i] < n){
                    arrNew[i] = arr[i];
                }else{
                    flag = false;
                    arrNew[i] = n;
                    if(i != arrNew.length - 1){
                        arrNew[i + 1] = arr[i];
                    }
                    
                }
            }else{
                arrNew[i + 1] = arr[i];
            }
            
        }
        if(flag){
            arrNew[arrNew.length - 1] = n;
        }
        arr = arrNew;
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
