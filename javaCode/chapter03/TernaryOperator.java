public class TernaryOperator{
	// ��ʾ��Ԫ�����
	public static void main(String[] args){
		int a = 10;  
		int b = 10;  
		int res = a > b ? a++ : b--;
		
		System.out.println(res);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
}