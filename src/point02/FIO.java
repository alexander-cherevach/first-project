package point02;

import java.util.Scanner;

public class FIO {
	
	public static void main(String[] args) {
	       
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���: ");
        String name = in.nextLine();
        System.out.print("������� �������: ");
        String surname = in.nextLine();
        System.out.print("������� �����: ");
        String address = in.nextLine();
        System.out.println("���� ���: " + name+ "\n"  + "���� �������: " + surname + "\n" +"��� �����: " + address);
    }   
}
