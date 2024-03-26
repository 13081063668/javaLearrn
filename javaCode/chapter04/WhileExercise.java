import java.util.Scanner;
public class WhileExercise{
	public static void main(String[] args){
		int i = 0;
		while(++i <= 100){
			if(i % 3 == 0){
				System.out.print(i + " ");
			}

		}
		System.out.println();
		i = 39;
		while(++i <= 200){
			if(i % 2 == 0){
				System.out.print(i + " ");
			}
			i++;
		}
		
	
	}
}