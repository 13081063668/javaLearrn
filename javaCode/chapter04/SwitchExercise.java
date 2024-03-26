import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符a-e");
		char ch = sc.next().charAt(0);

		switch(ch){
			case 'a':System.out.println("A");break;
			case 'b':System.out.println("B");break;
			case 'c':System.out.println("C");break;
			case 'd':System.out.println("D");break;
			case 'e':System.out.println("E");break;

			default:System.out.println("OTHER");
		}

		System.out.println("请输入成绩");
		int score = sc.nextInt();
		switch(score / 60){
			case 0:System.out.println("不合格");break;
			case 1:System.out.println("合格");
		}
		
		// System.out.println("月份");
		// int month = sc.nextInt();
		for(int month = 1;month <= 12; month ++){
			switch((month + 3) % 12 / 3){
				case 0:System.out.println("秋");break;
				case 1:System.out.println("冬");break;
				case 2:System.out.println("春");break;
				case 3:System.out.println("夏");break;
			}
		}
		for(int month = 1;month <= 12; month ++){
			switch(month){
				
				case 3:case 4:case 5:System.out.println("春");break;
				case 6:case 7:case 8:System.out.println("夏");break;
				case 9:case 10:case 11:System.out.println("秋");break;
				case 12:case 1:case 2:System.out.println("冬");break;
			}
		}
	}
}