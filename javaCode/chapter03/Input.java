import java.util.Scanner;
public class Input{
	// ��ʾ�����û�������
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); //����Scanner�Ķ���
		System.out.print("���������֣�");
		String name = input.next();
		System.out.print("���������䣺");
		int age = input.nextInt();
		System.out.print("������нˮ��");
		double sal = input.nextDouble();
		System.out.println("����:" + name + "����:" + age + "нˮ:" + sal);
		

	}
}