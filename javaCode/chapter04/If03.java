import java.util.Scanner;
public class If03{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������÷�");
		int grade = sc.nextInt();
		if(grade <= 100 && grade >= 0){
			if(grade == 100){
			System.out.println("���ü���");
			}else if(grade > 80){
				System.out.println("��������");
			}else if(grade > 60){
				System.out.println("����һ��");
			}else{
				System.out.println("���úܲ�");
			}
		}
	}
}