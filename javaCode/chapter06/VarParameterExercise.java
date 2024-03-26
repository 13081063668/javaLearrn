package javaCode.chapter06;

public class VarParameterExercise {
    public static void main(String[] args) {
        VarExercise v = new VarExercise();
        v.showScore("小明",2,3 );
        v.showScore("小红",2,3,4 );
        v.showScore("小张",2,3,4,5,6 );
    }
}

class VarExercise{
    public void showScore(String name, int ...scores){
        int sum = 0;
        for(int score:scores){
            sum += score;
        }
        System.out.println(name + "考了" + sum + "总分");
    }
}