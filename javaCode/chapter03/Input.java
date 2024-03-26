import java.util.Scanner;
public class Input{
	// 演示接收用户的输入
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //创建Scanner的对象
		System.out.print("请输入名字：");
		String name = input.next();
		System.out.print("请输入年龄：");
		int age = input.nextInt();
		System.out.print("请输入薪水：");
		double sal = input.nextDouble();
		System.out.println("名字:" + name + "年龄:" + age + "薪水:" + sal);
		

	}
}