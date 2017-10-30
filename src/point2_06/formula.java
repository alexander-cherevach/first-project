package point2_06;

import java.util.Scanner;

public class formula {

	public static void main(String[] args) {
		{ // вводим переменные для слагаемых
			double a = 0;
			double b = 0;
			double c = 0;
			double d = 0;
			double square = 2;
			double cube = 3;
			

			Scanner sc = new Scanner(System.in);

			System.out.print("Введите a: "); // юзер вводит 1 слагаемое
			if (sc.hasNextDouble()) {
				a = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}

			System.out.print("Введите b: "); // юзер вводит 2 слагаемое
			if (sc.hasNextDouble()) {
				b = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}
			System.out.print("Введите c: "); // юзер вводит 3 слагаемое
			if (sc.hasNextDouble()) {
				c = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}

			double check1 = (b + ( Math.sqrt (Math.pow (b, square) + (4*a*c ))   ) );
			double check2 = ((Math.pow (a, cube)*c )+b);
			System.out.print("Проверка1: " + check1+"\n"); 
			System.out.print("Проверка1: " + check2+"\n"); 
			double func1 = ((b + ( Math.sqrt (Math.pow (b, square) + (4*a*c ))   ) )-((Math.pow (a, cube)*c )+b))/(2*a);
			
			double func2 = (long)((a*b)-(a*b)-c)/(c*d);
			System.out.print("Значение 1 выражения: " + func1+"\n");
			
			System.out.print("Введите d: "); // юзер вводит 3 слагаемое
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
			} else { // защита, если юзер вводит не цифру
				System.out.print("К вводу принимаются только натуральные числа, программа завершена.");
				return;
			}
			
			System.out.print("Значение 2 выражения: " + func2);
		}
	}
}