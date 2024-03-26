public class BubbleSort {
    public static void main(String[] args){
        // 冒泡排序，每次把最大的元素放到最后
        int arr[] = {24,69,80,57,13};
        for(int i = 0;i < arr.length; i++){
            for(int j = 0;j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    arr[j] ^= arr[j + 1];
                    arr[j + 1] ^= arr[j];
                    arr[j] ^= arr[j + 1];
                }
            }
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
