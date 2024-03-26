public class TwoDementional05 {
    public static void main(String[] args){
        
        int [][]arr = {{1,1},{2,2,2},{3}};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(sum);
    } 
}
