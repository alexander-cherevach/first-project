package point2_01;

import java.util.Arrays;
import java.util.Random;

public class abcNewYear {

	public static void main(String[] args) {
		Random random = new Random();
		double a = random.nextInt();
		System.out.print("a= "+a+"\n");
		double b = random.nextInt();
		System.out.print("b=" + b + "\n");
	
		if (a==b){
			System.out.print("����� ����� ���!");
		} else {
			double c = random.nextInt();
			System.out.print("c=" + c + "\n");
			double sum = a + b + c;
			System.out.print("a+b+c=" + sum + "\n");
			
			double square = 2;
			double squareSum = Math.pow(a, square) + Math.pow(b, square);
			System.out.print("a\u00B2+b\u00B2=" + squareSum + "\n");
			System.out.print("�������� ������.");
		}

		
		/*String aString = Double.toString(a);
		int dotIndex = (char)aString.indexOf(".");
		System.out.print("������ �����= "+dotIndex+"\n");
		
		int index = dotIndex;
		while (index<dotIndex+2){
			index++;
			System.out.print("������ ����. ������� =" +index+"\n");
		}
			int[] massiv ;
			massiv[]=aString.charAt(dotIndex);
			massiv[1]=aString.charAt(index);
			massiv[2]=aString.charAt(index);
			System.out.println(Arrays.toString(massiv)); */
			
			
		
		/*int i = index;
		if (i == dotIndex || i == index){
			System.out.print(aString.charAt(index));
			
		} else {
			System.out.print("Nope!");
		}*/
			
		}
	}
		
		/*for (int index = dotIndex; index > +3; index++) {
		       System.out.print(index);//////here you will get all the index of  "("
		    } */
		
		/*for (int i = (int) dotIndex; i<4; i++){
			System.out.print(aString.charAt(i));
		} 
		
	}
}
		
		
	/*	double firstCharIndex = dotIndex+1;
		System.out.print("������ ������� ����� ����� �����= "+firstCharIndex+"\n");
		double secondCharIndex = dotIndex+2;
		System.out.print("������ ������� ����� ����� �����= "+secondCharIndex);
		
	*/



