package point2_02;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class throwNumbers2 {

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
		int counter = 0;
		int countD = 0;
		int countNull = 0;
		int countEven = 0;
		int countAbs3 = 0;
		int n = 0;
		int sum = 0;
		int [] numbersArray = new int [quantity];
		
		for (int i=0; i < quantity; i++) {
			Random random = new Random();
			n = random.nextInt((100 - 0) + 1) + 0;
			System.out.print ("Число:"+n+"\n");
			counter++;
			numbersArray[i] = n;
			
			if (n==0){
				countNull++;
				System.out.print ("Это ноль!"+"\n");
			}
			if ((n%2)==0){
				countEven++;
				System.out.print ("чётное"+"\n");
			} 
			if (Math.abs(n)<3) {
				countAbs3++;
				System.out.print ("с модулем <3"+"\n");
			}
			if ((n%3)!=0){
				System.out.print ("-"+"\n");
			}
			else {
				System.out.print ("КРАТНО 3"+"\n");
				countD++;
			}
			
		}
		
		for (int j=0; j<numbersArray.length;j++){
			if (numbersArray[j]%3==0) {
				sum +=numbersArray[j];
			}
		}
		
		System.out.println(Arrays.toString(numbersArray));
		System.out.print ("Всего чисел:"+counter+"\n");
		System.out.print ("Всего кратных 3:"+countD+"\n");
		System.out.print ("Сумма кратных 3:"+sum+"\n");
		System.out.print ("Кол-во чисел c модулем <3:"+ countAbs3+"\n");
		System.out.print ("Кол-во чётных чисел:"+ countEven+"\n");
	}
}



