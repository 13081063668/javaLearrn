package javaCode.chapter06;

public class EightQueen {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.printSolution(0, new int[8]);
        System.out.println(s.res);
    }
}

class  Solution {
    public int res = 0;
    public boolean canPlace(int row, int i, int []pos){
        for(int j = 0;j < row; j++){
            if(pos[j] == i || (Math.abs(pos[j] - i) == Math.abs(row - j))){
                return false;
            }
        }
        return true;
    }
    public void  printSolution(int row, int[] pos) {
        if(row == 8){
            res += 1;
            for(int i = 0;i < 8; i++){
                for(int j = 0;j < 8; j++){
                    if(pos[i] == j){
                        System.out.print("#");
                    }
                    else{
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
        for(int i = 0;i < 8; i++){
            if(canPlace(row, i, pos)){
                pos[row] = i;
                printSolution(row + 1, pos);
            }
        }
    }
}