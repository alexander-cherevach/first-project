package point06;

import java.util.Scanner;
import static java.lang.Math.*;

public class Equation {

	public static void main(String[] args) {
		// ��������� ����������
		double a = 0;
		double b = 0;
		double c = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("a= "); // ������ �
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		} else { // ��������
			System.out.print("������� �����. ��������� ���������.");
			return;
		}
		System.out.print("b= "); // ������ b
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		} else { // ��������
			System.out.print("������� �����. ��������� ���������.");
			return;
		}
		System.out.print("c= "); // ������ c
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		} else { // ��������
			System.out.print("������� �����. ��������� ���������.");
			return;
		}

		double square = 2; // ��� ���������� � �������
		double result = 0; // ��� ������ ����������
		
		// ������ ���������� 
		 
		 /* double part1 = 0; double part2 = 0; double part3 =
		  0;
		  
		  part1 = Math.pow(a, square); part2 = Math.pow(b - c, square); part3 =
		  Math.log1p(Math.pow(b, square));
		  
		  System.out.print("Part1="+part1+"\n"+"Part2="+part2+"\n"+"Part3="+
		  part3); double res=0; res=part1-part2+part3;
		  System.out.print("\n"+"result="+res);
		 */

		result = Math.pow(a, square) - Math.pow(b - c, square) + Math.log1p(Math.pow(b, square));
		System.out.print("�������� ��������� a\u00B2-(b-c)\u00B2+ln(b\u00B2+1), ��� a = " + a + ",b = " + b + ",c = " + c
				+"\n"+ " ����� " + result);

	}

}
