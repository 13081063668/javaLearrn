class ArrayReverse{
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int tmp = 0;
        int len = arr1.length;
        for(int i = 0; i < len/2; i ++){
            arr1[i] ^= arr1[len - i - 1];
            arr1[len - i - 1] ^= arr1[i];
            arr1[i] ^= arr1[len - i - 1];
        }
        for(int i = 0; i < len; i ++){
            System.out.println(arr1[i]);
        }
    }
}