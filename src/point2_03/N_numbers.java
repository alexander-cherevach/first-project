package point2_03;

import java.util.Random;
import java.util.Scanner;

public class N_numbers {

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
		 int countEven=0;
		 int biggerThan15=0;
		 for (int numbers=0; numbers < quantity; numbers++){
				
				Random random = new Random();
				double n = random.nextDouble()*30;
				System.out.print("�����:"+n+"\n");
				int cutDouble= (int)Math.round(n);
				System.out.print("����������:"+cutDouble+"\n");
				
				 if (cutDouble%2==0){
					 System.out.print("��� ר����!"+"\n");
					 for (int i=0; i<quantity; i++){
						 countEven++;
						 break;
				 }
}
				 if (cutDouble>15){
					 System.out.print("��� ������ 15!"+"\n");
					 for (int i=0; i<quantity; i++){
						 biggerThan15++;
						 break;
				 }
	}

}
		 System.out.print("����� ������:"+countEven+"\n");
		 System.out.print("����� >15:"+biggerThan15+"\n");	
}
}
