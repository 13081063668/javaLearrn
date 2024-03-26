import java.util.Scanner;
public class YangHui {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] yh = new int[n][];
        for(int i = 0; i < yh.length; i++){
            yh[i] = new int[i + 1];
            yh[i][0] = yh[i][i] = 1;
        }
        for(int i = 2; i < n; i++){
            for(int j = 1;j < i; j++){
                // System.out.println(1);
                yh[i][j] = yh[i - 1][j] + yh[i - 1][j -  1];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0;j < i + 1; j++){
                System.out.print(yh[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
