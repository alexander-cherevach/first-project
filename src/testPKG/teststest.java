package testPKG;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class teststest {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				int quantity = 0;
				System.out.print("����� ���-�� ����� �������?: "+"\n");
				if (sc.hasNextInt()) {
					quantity = sc.nextInt();
					} else { // ��������
						System.out.print("��� ������ ��������� ������� ������ ����� �����! ��������� ���������.");
					}
			
				int countDivByThree=0;
				int countNull=0;
				for (int i=0; i < quantity; i++){
					
					Random random = new Random();
				
					int n = random.nextInt((100 - 0) + 1) + 0;
					System.out.print ("�����:"+n+"\n");			
					int count = i+1;
					

					if (n==0){
						countNull++;
					}
				
					else {
						
					while ((n%3)==0){
							countDivByThree++;
							System.out.print ("������� ���"+"\n");
							break;
						}
					
	
				
				}
					System.out.print ("���-�� �����:"+ count+"\n");
					System.out.print ("���-�� �����:"+ countNull+"\n");
					System.out.print ("���-�� ����� ������� ���:"+ countDivByThree+"\n");
					
					for (int j=0; j<countDivByThree; j++){
						int nn=n;
						int sum=0;
						sum=sum+nn;
						System.out.println("����� ����� ������� ��� " + sum);
						break;
			}
		}


	}

}
