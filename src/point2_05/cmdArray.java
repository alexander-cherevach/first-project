package point2_05;

import java.util.Arrays;

public class cmdArray {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		
		for (int i=0; i<args.length; i++){
			try {
			n = Integer.parseInt(args[i]);
			int k=i;
			System.out.println("������ ������:"+k+" �����:"+n);
			sum+=n;
			}catch (NumberFormatException e) {
				System.out.println ("�����! �������, �� ����� �� ����� �����!");
			}
			
		}
			
		System.out.println("�����:"+sum);
		System.out.println("������:"+Arrays.toString(args));
		
}
}

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print(
		 * "������ �����? (y/n): "+"\n");
		 * 
		 * if (scan.hasNext("y")) { System.out.print("������� ����� �����: "
		 * +"\n");
		 * 
		 * if (scan.hasNextInt()) { int number = scan.nextInt();
		 * System.out.print(number+"\n"); } else { // �������� System.out.print(
		 * "��� ������ ��������� ������� ������ ����� �����! ��������� ���������."
		 * ); return; }
		 * 
		 * 
		 * int i = 0; int number = scan.nextInt(); if (scan.hasNextInt()) { for
		 * (int j=0;j<args.length;j++){ args [i] = Integer.toString (number); }
		 * } else { // �������� System.out.print(
		 * "��� ������ ��������� ������� ������ ����� �����! ��������� ���������."
		 * );
		 * 
		 * } } if (scan.hasNext("n")){ System.out.print("�����!"+"\n"); } else{
		 * System.out.print("������, ����������� ������� \"y\" ��� \"n\""+"\n");
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
