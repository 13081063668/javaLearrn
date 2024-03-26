import java.util.Scanner;
public class Array02{
	public static void main(String[] args){
		// 定义一个数组
		// 定义了一个double类型的数组
		double[] scores = new double[5];
		// 遍历数组
		// 求和
		double total = 0;
        Scanner sc = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			scores[i] = sc.nextDouble();
            total += scores[i];
		}
        for(int i = 0; i < scores.length; i++){
			System.out.println("第"+i+"个值为" + scores[i]);
		}
		System.out.println("总共的值为" + total);
			
	}
}