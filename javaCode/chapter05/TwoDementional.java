public class TwoDementional {
    public static void main(String[] args){
        int [][] arr = {{0,0,0,0,0},
                        {1,0,-1,0,0},
                        {0,1,-1,0,0},
                        {0,0,1,0,0},
                        {0,0,0,1,0}
                    };
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    } 
}
