public class InverseOperator{
	public static void main(String[] args){
		System.out.println(60 > 20); // 
		System.out.println(!(60 > 20)); // 非
		
		boolean b = (10 > 1) ^ (3 < 5); // 同零异一
		System.out.println("b=" + b);
		
	}
}