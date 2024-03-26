import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩");
		double score = sc.nextDouble();
		if(score > 8.0){
			System.out.println("请输入性别");
			char gender = sc.next().charAt(0);
			if(gender == '男'){
				System.out.println("男子组");
			}else if(gender == '女'){
				System.out.println("女子组");
			}
		}else{
			System.out.println("淘汰");
		}
	
	}
}