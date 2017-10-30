package point2_02;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.Scanner;

public class throwNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int quantity = 0;
		System.out.print("Какое кол-во чисел вводить?: "+"\n");
		if (sc.hasNextInt()) {
			quantity = sc.nextInt();
			} else { // проверка
				System.out.print("Для работы программы следует ввести целое число! Программа завершена.");
			}
		int count =0;
		int countEven =0;
		int countDivByThree=0;
		int countAbs3=0;
		int countNull=0;
		for (int i=0; i < quantity; i++){
			
			Random random = new Random();
			
			//int n = random.nextInt();
			int n = random.nextInt((100 - 0) + 1) + 0;
			System.out.print ("Число:"+n+"\n");			
			count = i+1;
			

			if (n==0){
				countNull++;
			}
		
			else {
				
			while ((n%3)==0){
					countDivByThree++;
					System.out.print ("кратное трём"+"\n");
					break;
				}
				
			while((n%2)==0){
				countEven++;
				System.out.print ("чётное"+"\n");
				break;
			} 
			
			while (Math.abs(n)<3) {
				countAbs3++;
				System.out.print ("с модулем <3"+"\n");
				break;
			}
		}
		}
		
		/*
		 * 
		 */

		System.out.print ("Кол-во нулей:"+ countNull+"\n");
		System.out.print ("Кол-во чисел:"+ count+"\n");
		System.out.print ("Кол-во чётных чисел:"+ countEven+"\n");
		System.out.print ("Кол-во чисел кратных трём:"+ countDivByThree+"\n");
		System.out.print ("Кол-во чисел c модулем <3:"+ countAbs3+"\n");
	}
}
