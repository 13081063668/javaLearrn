public class Array01{
	public static void main(String[] args){
		// 定义一个数组
		// 定义了一个double类型的数组
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		// 遍历数组
		// 求和
		double total = 0;
		for(int i = 0; i < hens.length; i++){
			total += hens[i];
			System.out.println("第" + i + "个元素的值为" + hens[i]);
		}
		System.out.println("总共的值为" + total);
			
	}
}