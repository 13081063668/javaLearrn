package javaCode.chapter06;

public class Homework02 {
    public static void main(String[] args) {
        String strs[] = {"sss","111","aaa"};
        System.out.println(new A02().find(strs,"aaa"));
        System.out.println(new A02().find(strs,"bbb"));

    }
}
class A02{
    public int find(String []strs, String findWord){
        int idx = -1;
        for(int i = 0; i < strs.length; i++){
            if(findWord.equals(strs[i])){
                idx = i;
                return idx;
            }
        }
        return idx;
    }
}
