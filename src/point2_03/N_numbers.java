package point2_03;

import java.util.Random;
import java.util.Scanner;

public class N_numbers {

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
		 int countEven=0;
		 int biggerThan15=0;
		 for (int numbers=0; numbers < quantity; numbers++){
				
				Random random = new Random();
				double n = random.nextDouble()*30;
				System.out.print("Число:"+n+"\n");
				int cutDouble= (int)Math.round(n);
				System.out.print("Округлённое:"+cutDouble+"\n");
				
				 if (cutDouble%2==0){
					 System.out.print("ЭТО ЧЁТНОЕ!"+"\n");
					 for (int i=0; i<quantity; i++){
						 countEven++;
						 break;
				 }
}
				 if (cutDouble>15){
					 System.out.print("ЭТО БОЛЬШЕ 15!"+"\n");
					 for (int i=0; i<quantity; i++){
						 biggerThan15++;
						 break;
				 }
	}

}
		 System.out.print("Всего чётных:"+countEven+"\n");
		 System.out.print("Всего >15:"+biggerThan15+"\n");	
}
}
