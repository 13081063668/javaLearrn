import java.util.Scanner;
public class SwitchExercise{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�a-e");
		char ch = sc.next().charAt(0);

		switch(ch){
			case 'a':System.out.println("A");break;
			case 'b':System.out.println("B");break;
			case 'c':System.out.println("C");break;
			case 'd':System.out.println("D");break;
			case 'e':System.out.println("E");break;

			default:System.out.println("OTHER");
		}

		System.out.println("������ɼ�");
		int score = sc.nextInt();
		switch(score / 60){
			case 0:System.out.println("���ϸ�");break;
			case 1:System.out.println("�ϸ�");
		}
		
		// System.out.println("�·�");
		// int month = sc.nextInt();
		for(int month = 1;month <= 12; month ++){
			switch((month + 3) % 12 / 3){
				case 0:System.out.println("��");break;
				case 1:System.out.println("��");break;
				case 2:System.out.println("��");break;
				case 3:System.out.println("��");break;
			}
		}
		for(int month = 1;month <= 12; month ++){
			switch(month){
				
				case 3:case 4:case 5:System.out.println("��");break;
				case 6:case 7:case 8:System.out.println("��");break;
				case 9:case 10:case 11:System.out.println("��");break;
				case 12:case 1:case 2:System.out.println("��");break;
			}
		}
	}
}