package point02;

import java.util.Scanner;

public class FIO {
	
	public static void main(String[] args) {
	       
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.print("Введите адрес: ");
        String address = in.nextLine();
        System.out.println("Ваше имя: " + name+ "\n"  + "Ваша фамилия: " + surname + "\n" +"Ваш Адрес: " + address);
    }   
}
