package point2_04;

import java.util.Random;
import java.util.Scanner;

public class num2_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ���-�� ����� �������?: "+"\n");
		int quantity=0;
		if (scan.hasNextInt()) {
			quantity = scan.nextInt();
			} else { // ��������
				System.out.print("��� ������ ��������� ������� ������ ����� �����! ��������� ���������.");
				return;
			}
		 int count = 0;
		 int count2 = 0;
		 int sum = 0;
		 
		 for (int numbers=0; numbers < quantity; numbers++){
				
				Random random = new Random();
				int n = random.nextInt(100);
				System.out.print("�����:"+n+"\n");
				
				 if (n>15 | n<2){
					 System.out.print("��� ������ ���� ��� ������ ����������!"+"\n");
					 for (int i=0; i<quantity; i++){
						 count++;
						 break;
				 }
}
				 if (n%5==4){
					 System.out.print("��� ������� �� 5 � �������� 4"+"\n");
					 for (int i=0; i<quantity; i++){
						 count2++;
						 sum+=n;
						 break;
						 
				 }
	}

}
		 System.out.print("����� ����� <2 � >15:"+count+"\n");
		 System.out.print("����� ����� ������� �� 5 � �������� 4:"+count2+"\n");
		 System.out.print("����� �����, ������� ������� �� 5 � �������� 4:"+sum+"\n");	
		 


	}

}
