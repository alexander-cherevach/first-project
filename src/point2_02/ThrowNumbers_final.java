package point2_02;

import java.util.Random;
import java.util.Scanner;

public class ThrowNumbers_final {

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
		
		int countAll = 0;
		int countZero = 0;
		int countEven = 0;
		int countDivByThree = 0;
		int sumDivByThree = 0;
		int countAbs3 = 0;
		
         for (int numbers=0; numbers < quantity; numbers++){
			
			Random random = new Random();
			int n = random.nextInt(100);
			System.out.print("�����:"+n+"\n");
			
			if (n==0){
				System.out.print("��� ����!"+"\n");
				for (int i=0; i<quantity; i++){
					countZero++;
				}
			}
			if ((n%2)==0) {
				System.out.print("��� ר����!"+"\n");
				for (int j=0; j<quantity; j++){
					countEven++;
					break;
			}
			
 		}
			if (Math.abs(n)<3) {
				System.out.print("������ ������ �Ш�!"+"\n");
				for (int x=0; x<quantity; x++){
					countAbs3++;
			}
			
 		}
			if ((n%3)==0) {
				System.out.print("��� ������� �Ш�!"+"\n");
				for (int k=0; k<quantity; k++){
					countDivByThree++;
					int value = n;
					sumDivByThree += value;
					break;
			}
			
 		}
  }		
         System.out.print("����� �����:"+countZero+"\n");
         System.out.print("����� ������:"+countEven+"\n");
         System.out.print("����� ������� 3:"+countDivByThree+"\n");
         System.out.print("����� c ������� <3:"+countAbs3+"\n");
         System.out.print("C���� ������� 3:"+sumDivByThree+"\n");
	
}
}

