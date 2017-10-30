package by.epam.jb.home06;

import java.util.Scanner;

public class point6 {
			public static void main(String[] args) {
				
				double x = 0, y = 0, c = 0, z, inv;
				Scanner sc = new Scanner(System.in);
		
				System.out.print("Input x: ");
				if (sc.hasNextDouble()) {
					x = sc.nextDouble();
				}
		
				System.out.print("Input y: ");
				if (sc.hasNextDouble()) {
					y = sc.nextDouble();
				}
		
				double temp;
				temp = Math.cos(x) - x / 3;
				if (temp != 0) {
					z = x * Math.log(x) + y / temp;
				} else {
					System.out.println("=.");
					z = Double.NaN;
				}
		
				System.out.println("z=" + z);
			}
		
		
		

	}


