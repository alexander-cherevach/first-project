package point07;

import java.util.Random;
import java.util.Scanner;

public class randomNumbers {

	public static void main(String[] args) {
		Random random = new Random();
		double a = random.nextInt();
		System.out.print("a=" + a + "\n");
		double b = random.nextInt();
		System.out.print("b=" + b + "\n");

		if (a > b) {
			double c = random.nextInt();
			System.out.print("c=" + c + "\n");
			double bcSum = b + c;
			System.out.print("����� b+c=" + bcSum + "\n");
		}

		if (a == b) {
			System.out.print("� � � � �.");
		}

		if (a < b) {
			double c = random.nextInt();
			System.out.print("c=" + c + "\n");
			double abcSum = a + b + c;
			System.out.print("����� a+b+c=" + abcSum + "\n" + "����� ���!");
		}
	}

}
