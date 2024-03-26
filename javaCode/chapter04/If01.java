import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄");
		int age = sc.nextInt();
		if(age > 18){
			System.out.println("好的，您18岁了");
		}
	}
}