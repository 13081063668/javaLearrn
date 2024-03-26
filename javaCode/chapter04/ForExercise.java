import java.util.Scanner;
public class ForExercise{
	public static void main(String[] args){
		int sum = 0;
		int count = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 9 == 0){
				System.out.print(i + " ");
				sum += i;
				count += 1;
			}
		}
		System.out.println();
		System.out.println("共计" + count + "个,总和为" + sum);
		
		
		for(int i = 0;i < 5; i++){
			System.out.println(i + " + " + (5 - i) + " = 5" );
			
		}
	
	}
}