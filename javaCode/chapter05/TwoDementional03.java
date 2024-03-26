public class TwoDementional03 {
    public static void main(String[] args){
        int [][] arr = new int[3][];

        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[i + 1];
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = i + 1;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int [][]arr2 = {{1,1,1},{2,2,2},{3}};
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    } 
}
