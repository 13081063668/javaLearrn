public class AutoConvertDetail{
	public static void main(String[] args){
		int n1 = 10;
		// float d1 = n1 + 1.1; 错误 因为 1.1默认为double，多类型运算会使用最大容量的数据类型，所以n1 + 1.1 => 结果数据类型为double，不可以将大数据类型赋值给小精度
		float d1 = n1 + 1.1f;
		double d2 = n1 + 1.1;
		
		// int n2 = 1.1; double 大精度 int 小精度
		// 当把数赋值给byte时，先判断该数是否在byte的范围内，如果在就可以 直接赋值，判断范围
		byte b1 = 10; // byte -128 -> 127
		//int n2 = 1;	byte b2 = n2; 错误，n2为四字节int，byte为单字节 变量赋值，判断类型
		//(byte,short) 和char之间不可自动转换
		// char c1 = b1; 错误
		short s1 = 1;
		// short s2 = b1 + s1;// 错误， byte和short运算会自动转化为short
		
		
	}
}