public class StringToBasic{
	public static void main(String[] args){
		int n1 = 100;
		float f1 = 1.1f;
		double d1 = 1.11;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		System.out.println(num1);
		
	}
}