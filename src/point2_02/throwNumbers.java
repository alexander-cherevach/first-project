package point2_02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.Scanner;

public class throwNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantity = 0;
		System.out.print("����� ���-�� ����� �������?: "+"\n");
		if (sc.hasNextInt()) {
			quantity = sc.nextInt();
			} else { // ��������
				System.out.print("��� ������ ��������� ������� ������ ����� �����! ��������� ���������.");
			}
		int count =0;
		int countEven =0;
		int countDivByThree=0;
		int countAbs3=0;
		int countNull=0;
		for (int i=0; i < quantity; i++){
			
			Random random = new Random();
			
			//int n = random.nextInt();
			int n = random.nextInt((100 - 0) + 1) + 0;
			System.out.print ("�����:"+n+"\n");			
			count = i+1;
			

			if (n==0){
				countNull++;
			}
		
			else {
				
			while ((n%3)==0){
					countDivByThree++;
					System.out.print ("������� ���"+"\n");
					break;
				}
				
			while((n%2)==0){
				countEven++;
				System.out.print ("������"+"\n");
				break;
			} 
			
			while (Math.abs(n)<3) {
				countAbs3++;
				System.out.print ("� ������� <3"+"\n");
				break;
			}
		}
		}
		
		/*
		 * 
		 */

		System.out.print ("���-�� �����:"+ countNull+"\n");
		System.out.print ("���-�� �����:"+ count+"\n");
		System.out.print ("���-�� ������ �����:"+ countEven+"\n");
		System.out.print ("���-�� ����� ������� ���:"+ countDivByThree+"\n");
		System.out.print ("���-�� ����� c ������� <3:"+ countAbs3+"\n");
	}
}
