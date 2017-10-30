package point2_02;

import java.util.Random;
import java.util.Scanner;

public class ThrowNumbers_final {

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
		
		int countAll = 0;
		int countZero = 0;
		int countEven = 0;
		int countDivByThree = 0;
		int sumDivByThree = 0;
		int countAbs3 = 0;
		
         for (int numbers=0; numbers < quantity; numbers++){
			
			Random random = new Random();
			int n = random.nextInt(100);
			System.out.print("Число:"+n+"\n");
			
			if (n==0){
				System.out.print("ЭТО НОЛЬ!"+"\n");
				for (int i=0; i<quantity; i++){
					countZero++;
				}
			}
			if ((n%2)==0) {
				System.out.print("ЭТО ЧЁТНОЕ!"+"\n");
				for (int j=0; j<quantity; j++){
					countEven++;
					break;
			}
			
 		}
			if (Math.abs(n)<3) {
				System.out.print("МОДУЛЬ МЕНЬШЕ ТРЁХ!"+"\n");
				for (int x=0; x<quantity; x++){
					countAbs3++;
			}
			
 		}
			if ((n%3)==0) {
				System.out.print("ЭТО КРАТНОЕ ТРЁМ!"+"\n");
				for (int k=0; k<quantity; k++){
					countDivByThree++;
					int value = n;
					sumDivByThree += value;
					break;
			}
			
 		}
  }		
         System.out.print("Всего нулей:"+countZero+"\n");
         System.out.print("Всего чётных:"+countEven+"\n");
         System.out.print("Всего кратных 3:"+countDivByThree+"\n");
         System.out.print("Всего c модулем <3:"+countAbs3+"\n");
         System.out.print("Cумма кратных 3:"+sumDivByThree+"\n");
	
}
}

