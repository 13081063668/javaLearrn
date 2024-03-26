import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈë×Ö·ûa-g");
		char ch = sc.next().charAt(0);
		switch(ch){
			case 'a':System.out.println("1");break;
			case 'b':System.out.println("2");break;
			case 'c':System.out.println("3");break;
			case 'd':System.out.println("4");break;
			case 'e':System.out.println("5");break;
			case 'f':System.out.println("6");break;
			case 'g':System.out.println("7");break;
			default:System.out.println("ÇëÊäÈëa-g");
		}
	
	}
}