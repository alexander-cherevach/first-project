package point04;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		double a = 0, b = 0, square = 2; // ��������� ���������� ��� �������
											// (a,b) � ���������� � �������
											// (square)
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �����: "); // ���� ������ ����� 1 ������
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		} else { // ������, ���� ���� ������ �� �����
			System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
			return;
		}

		System.out.print("������ �����: "); // ���� ������ ����� 2 ������
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		} else { // ������, ���� ���� ������ �� �����
			System.out.print("� ����� ����������� ������ ����������� �����, ��������� ���������.");
			return;
		}

		System.out.print("������ �����=" + a + "\n" + "������ �����=" + b + "\n");

		double c2 = 0, c = 0, temp = 0;

		c2 = Math.pow(a, square) + Math.pow(b, square); // ������� �������
														// ����������
		c = Math.sqrt(c2); // ������� ����������

		double S = 0;
		double drob = 1.2;
		S = drob * a * b; // ������� �������

		System.out.print("������� ������������=" + S + "\n" + "����������=" + c);
	}

}
