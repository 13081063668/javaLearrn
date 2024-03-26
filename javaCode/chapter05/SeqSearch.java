import java.util.Scanner;
public class SeqSearch {
    public static void main(String[] args){
        String strs[] = {"yyf","yyf1","yyf2"};
        Scanner sc = new Scanner(System.in);
        String findName = sc.next();
        int idx = -1;
        for(int i = 0; i <strs.length; i++){
            if(strs[i].equals(findName)){
                idx = i;
                break;
            }
        }
        if(idx != -1){
            System.out.println("找到了第" + idx + "个人" + findName);
        }else{
            System.out.println("抱歉，找不到"+ findName + "这个人");
        }
    }
}
