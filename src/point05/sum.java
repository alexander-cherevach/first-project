package point05;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		{ // ������ ���������� ��� ���������
			double a = 0;
			double b = 0;
			double c = 0;
			double d = 0;

			Scanner sc = new Scanner(System.in);

			System.out.print("������ ���������: "); // ���� ������ 1 ���������
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}

			System.out.print("������ ���������: "); // ���� ������ 2 ���������
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}
			System.out.print("������ ���������: "); // ���� ������ 3 ���������
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}
			System.out.print("�������� ���������: "); // ���� ������ 4
														// ���������
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
			} else { // ������, ���� ���� ������ �� �����
				System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
				return;
			}

			double sum;
			sum = a + b + c + d;
			System.out.print("�����: " + sum); // ������� ����� 4 ���������
		}
	}
}
