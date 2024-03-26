public class TernaryOperatorDetail{
	// 演示三元运算符
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		int c = 2;
		int res = (a > b ? a : b) > c ? (a > b ? a : b) : c; 

		System.out.println("三者的最大值为" + res);

	}
}