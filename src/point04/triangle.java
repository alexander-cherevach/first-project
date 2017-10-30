package point04;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		double a = 0, b = 0, square = 2; // объявляем переменные для катетов
											// (a,b) и возвденеия в квадрат
											// (square)
		Scanner sc = new Scanner(System.in);

		System.out.print("Первый катет: "); // юзер вводит длину 1 катета
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		} else { // защита, если юзер вводит не цифру
			System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
			return;
		}

		System.out.print("Второй катет: "); // юзер вводит длину 2 катета
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		} else { // защита, если юзер вводит не цифру
			System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
			return;
		}

		System.out.print("Первый катет=" + a + "\n" + "Второй катет=" + b + "\n");

		double c2 = 0, c = 0, temp = 0;

		c2 = Math.pow(a, square) + Math.pow(b, square); // находим квадрат
														// гипотенузы
		c = Math.sqrt(c2); // находим гипотенузу

		double S = 0;
		double drob = 1.2;
		S = drob * a * b; // находим площадь

		System.out.print("Площадь треугольника=" + S + "\n" + "Гипотенуза=" + c);
	}

}
