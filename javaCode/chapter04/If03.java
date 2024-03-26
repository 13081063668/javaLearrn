import java.util.Scanner;
public class If03{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入信用分");
		int grade = sc.nextInt();
		if(grade <= 100 && grade >= 0){
			if(grade == 100){
			System.out.println("信用极好");
			}else if(grade > 80){
				System.out.println("信用优秀");
			}else if(grade > 60){
				System.out.println("信用一般");
			}else{
				System.out.println("信用很差");
			}
		}
	}
}