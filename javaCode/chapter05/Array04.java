public class Array04 {
    public static void main(String []args){
        int array[] = {4,-1,9,10,23};
        int maxArr = array[0];
        for(int i = 1;i < array.length; i++){
            maxArr = Math.max(maxArr, array[i]);
        }
        System.out.println("最大的值为" + maxArr);
    }
}
