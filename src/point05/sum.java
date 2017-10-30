package point05;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		{ // вводим переменные для слагаемых
			double a = 0;
			double b = 0;
			double c = 0;
			double d = 0;

			Scanner sc = new Scanner(System.in);

			System.out.print("Первое слагаемое: "); // юзер вводит 1 слагаемое
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}

			System.out.print("Второе слагаемое: "); // юзер вводит 2 слагаемое
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}
			System.out.print("Третье слагаемое: "); // юзер вводит 3 слагаемое
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}
			System.out.print("Четвёртое слагаемое: "); // юзер вводит 4
														// слагаемое
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}

			double sum;
			sum = a + b + c + d;
			System.out.print("Сумма: " + sum); // выводим сумму 4 слагаемых
		}
	}
}
