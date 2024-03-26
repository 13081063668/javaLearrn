import java.util.Scanner;
public class HomeWork02{
	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		double allsum = 0;
		int count = 0;
		for(int i = 0; i < 3; i++){
			double sum = 0;
			for(int j = 0; j < 5; j++){
				double score = sc.nextDouble();
				if(score >= 6){
					count ++;
				}
				sum += score;
			}
			System.out.println("第" + i + "个班级的平均成绩为" + (sum / 5) + "分!");
			System.out.println("第" + i + "个班级的及格人数为" + count );
			
			allsum += sum;
		}
		System.out.println("整体的平均成绩为" + (allsum / 15) + "分!");
		
		
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			
			}System.out.println();
		}*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - i - 1; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < 2 * i + 1; j++){
				if(j == 0 || j == 2 * i || i == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}