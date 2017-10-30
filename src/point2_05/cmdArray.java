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
			System.out.println("Индекс ячейки:"+k+" число:"+n);
			sum+=n;
			}catch (NumberFormatException e) {
				System.out.println ("Ууупс! Кажется, вы ввели не целое число!");
			}
			
		}
			
		System.out.println("Сумма:"+sum);
		System.out.println("Массив:"+Arrays.toString(args));
		
}
}

		/*
		 * Scanner scan = new Scanner(System.in); System.out.print(
		 * "Ввести число? (y/n): "+"\n");
		 * 
		 * if (scan.hasNext("y")) { System.out.print("Введите целое число: "
		 * +"\n");
		 * 
		 * if (scan.hasNextInt()) { int number = scan.nextInt();
		 * System.out.print(number+"\n"); } else { // проверка System.out.print(
		 * "Для работы программы следует ввести целое число! Программа завершена."
		 * ); return; }
		 * 
		 * 
		 * int i = 0; int number = scan.nextInt(); if (scan.hasNextInt()) { for
		 * (int j=0;j<args.length;j++){ args [i] = Integer.toString (number); }
		 * } else { // проверка System.out.print(
		 * "Для работы программы следует ввести целое число! Программа завершена."
		 * );
		 * 
		 * } } if (scan.hasNext("n")){ System.out.print("Конец!"+"\n"); } else{
		 * System.out.print("Ошибка, используйте символы \"y\" или \"n\""+"\n");
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
