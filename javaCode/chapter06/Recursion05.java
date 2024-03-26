package javaCode.chapter06;

public class Recursion05 {
    public static void main(String[] args) {
        int[][] map =  new int[8][7];
        for(int i = 0; i < map[0].length; i++){
            map[7][i] = map[0][i] = 1;
        }
        for(int i = 0; i < map.length; i++){
            map[i][0] = map[i][6] = 1;
        }
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        map[3][1] = map[3][2] = 1;
        System.out.println(new TTTT().findWay(map, 1, 1));
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
 
    }
}

class TTTT{
    // 使用递归思想解决老鼠出迷宫
    public boolean findWay(int [][]map, int i,int j){
        if(map[6][5] == 2){
            return true;
        }
        if(map[i][j] == 0){
            map[i][j] = 2;
            int [][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
            for(int k = 0; k < dir.length; k++){
                int x = i + dir[k][0];
                int y = j + dir[k][1];
                if(x >= 0 && x < map.length && y >= 0 && y < map[0].length && (map[x][y] == 0 || map[x][y] == 2) ){
                    if(findWay(map, x, y)){
                        System.out.println(x + " " + y);
                        return true;
                    }
                }
            }
            map[i][j] = 3;
        }
        return false;
    }
}