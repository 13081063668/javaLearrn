public class LogicOperator01{
	
	public static void main(String[] args){
		int age = 50;
		
		if(age > 20 && age < 80){
			System.out.println("ok111");
		}
		if(age > 20 & age < 80){
			System.out.println("ok222");
		}
		
		int a = 4;
		int b = 9;
		if(a < 1 && ++b < 50){
			System.out.println(b);
		}
		System.out.println(b);
		if(a < 1 & ++b < 50){
			System.out.println(b);
		}
		System.out.println(b);
		
		a = 4;
		b = 9;
		if(a > 1 || ++b < 50){
			System.out.println(b);
		}
		System.out.println(b);
		if(a > 1 | ++b < 50){
			System.out.println(b);
		}
		System.out.println(b);
	}
}u