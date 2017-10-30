package point2_04;

import java.util.Random;
import java.util.Scanner;

public class num2_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Какое кол-во чисел вводить?: "+"\n");
		int quantity=0;
		if (scan.hasNextInt()) {
			quantity = scan.nextInt();
			} else { // проверка
				System.out.print("Для работы программы следует ввести целое число! Программа завершена.");
				return;
			}
		 int count = 0;
		 int count2 = 0;
		 int sum = 0;
		 
		 for (int numbers=0; numbers < quantity; numbers++){
				
				Random random = new Random();
				int n = random.nextInt(100);
				System.out.print("Число:"+n+"\n");
				
				 if (n>15 | n<2){
					 System.out.print("ЭТО МЕНЬШЕ ДВУХ ИЛИ БОЛЬШЕ ПЯТНАДЦАТИ!"+"\n");
					 for (int i=0; i<quantity; i++){
						 count++;
						 break;
				 }
}
				 if (n%5==4){
					 System.out.print("ЭТО ДЕЛИТСЯ НА 5 С ОСТАТКОМ 4"+"\n");
					 for (int i=0; i<quantity; i++){
						 count2++;
						 sum+=n;
						 break;
						 
				 }
	}

}
		 System.out.print("Всего чисел <2 и >15:"+count+"\n");
		 System.out.print("Всего чисел делится на 5 с остатком 4:"+count2+"\n");
		 System.out.print("Сумма чисел, которые делятся на 5 с остатком 4:"+sum+"\n");	
		 


	}

}
