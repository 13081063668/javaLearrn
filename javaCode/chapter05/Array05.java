public class Array05 {
    public static void main(String []args){
        int arr1[] = {1,2,3};
        int arr2[] = arr1;
        arr1[0] = 4;// 修改后 arr2[0]也等于4，同时arr2的变化也会影响arr1
        System.out.println(arr2[0]);
    }
}
