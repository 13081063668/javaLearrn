import java.util.Scanner;
public class DoWhileExercise{
	public static void main(String[] args){
		int i = 0;
		int sum = 0;
		int count = 0;
		do{
			sum += i;
			System.out.print((i++) + " ");
		}while(++i <= 100);
		System.out.println();

		i = 1;
		do{
			if(i % 5 == 0 && i % 3 != 0){
				count ++;
			}
		}while(++i <= 200);
		System.out.println(count);
		Scanner sc = new Scanner(System.in);
		char ch = 'n';
		do{
			System.out.println("»¹Ç®Âï£¿y/n");
			ch = sc.next().charAt(0);
			
		}while(ch != 'y');

		
	
	}
}