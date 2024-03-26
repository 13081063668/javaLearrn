package javaCode.chapter06;

public class HanoiTower {
    public static void main(String[] args) {
        Hanoi tower = new Hanoi();
        tower.move(64, 'A', 'B', 'C');
    }
}
class Hanoi{
    // a b c 分别表示 a b c 三个塔
    // move 的意思是从a借助b移动到c
    public void move(int num, char a, char b, char c){
        if(num == 1){
            System.out.println(a + " -> " + c);
        }else{
            // 如果有多个盘，可以看成两个，最下面和最上面所有盘
            // 移动上面所有的盘到b，借助c
            move(num - 1, a, c, b);
            // 把最下面的盘，移动到C
            System.out.println(a + " -> " + c);
            // 再把b所有盘移动到a
            move(num - 1, b, a, c);
        }
    }
}
