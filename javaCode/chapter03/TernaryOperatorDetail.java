public class TernaryOperatorDetail{
	// ��ʾ��Ԫ�����
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		int c = 2;
		int res = (a > b ? a : b) > c ? (a > b ? a : b) : c; 

		System.out.println("���ߵ����ֵΪ" + res);

	}
}