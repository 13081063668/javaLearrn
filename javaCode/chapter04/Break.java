import java.util.Scanner;
public class Break{
	public static void main(String[] args){
		int count = 0 ;
		for(;;){
			int r = (int)(Math.random() * 100) + 1;
			count += 1;
			System.out.println(r);
			if(r == 97)
				break;
		}
			System.out.println("π≤”√" + count + "¥Œ");
		lable1:
		for(int i = 0; i < 10; i++){
			label2:
			for(int j = 0; j < 10; j++){
				System.out.println(i + " " +j);
				if(i == 3 && j == 4){
					break lable1;
				}
			}
		}
		
	}
}