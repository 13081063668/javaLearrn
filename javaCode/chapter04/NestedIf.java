import java.util.Scanner;
public class NestedIf{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ�");
		double score = sc.nextDouble();
		if(score > 8.0){
			System.out.println("�������Ա�");
			char gender = sc.next().charAt(0);
			if(gender == '��'){
				System.out.println("������");
			}else if(gender == 'Ů'){
				System.out.println("Ů����");
			}
		}else{
			System.out.println("��̭");
		}
	
	}
}