package point2_06;

import java.util.Scanner;

public class formula {

	public static void main(String[] args) {
		{ // ������ ���������� ��� ���������
			double a = 0;
			double b = 0;
			double c = 0;
			double d = 0;
			double square = 2;
			double cube = 3;
			

			Scanner sc = new Scanner(System.in);

			System.out.print("������� a: "); // ���� ������ 1 ���������
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}

			System.out.print("������� b: "); // ���� ������ 2 ���������
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}
			System.out.print("������� c: "); // ���� ������ 3 ���������
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}

			double check1 = (b + ( Math.sqrt (Math.pow (b, square) + (4*a*c ))   ) );
			double check2 = ((Math.pow (a, cube)*c )+b);
			System.out.print("��������1: " + check1+"\n"); 
			System.out.print("��������1: " + check2+"\n"); 
			double func1 = ((b + ( Math.sqrt (Math.pow (b, square) + (4*a*c ))   ) )-((Math.pow (a, cube)*c )+b))/(2*a);
			
			double func2 = (long)((a*b)-(a*b)-c)/(c*d);
			System.out.print("�������� 1 ���������: " + func1+"\n");
			
			System.out.print("������� d: "); // ���� ������ 3 ���������
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}
			
			System.out.print("�������� 2 ���������: " + func2);
		}
	}
}