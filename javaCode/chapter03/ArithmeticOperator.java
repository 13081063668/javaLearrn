public class ArithmeticOperator{
	public static void main(String[] args){
		// / 的使用
		System.out.println(10 / 4); // 2
		System.out.println(10.0 / 4); // 2.5
		double d = 10 / 4;
		System.out.println(d); // 2.0
		
		// % 的使用
		System.out.println(10 % 3); // 1
		System.out.println(-10 % 3); // -1
		System.out.println(10 % -3); // 1
		System.out.println(-10 % -3); // -1
		// %的本质 a % b = a - a /b
		
		int i = 10;
		System.out.println("i = " + i++); // 10
		System.out.println("i = " + i++); // 11
		System.out.println("i = " + ++i); // 13
		
		i = 1;
		i = i++;
		System.out.println("i = " + i); // 1  (1)tmp = i;(2)i = i + 1;(3)i = tmp;
		
		i = 1;
		i = ++i;
		System.out.println("i = " + i); // 2  (1)i = i + 1;(2)tmp = i;(3)i = tmp;
	}
}