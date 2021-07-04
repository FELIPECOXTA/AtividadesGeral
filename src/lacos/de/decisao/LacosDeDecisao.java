package lacos.de.decisao;

import java.util.Scanner;

public class LacosDeDecisao {

	//1.0 Faça um programa que receba três inteiros e diga qual deles é o maior.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1;
		int number2;
		int number3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Write the 1st Number");
		number1 = read.nextInt();
		
		System.out.println("Write the 2nd Number");
		number2 = read.nextInt();
		
		System.out.println("Write the 3rd Number");
		number3 = read.nextInt();
		
		if (number1 > number2 && number1 > number3) {
			System.out.println("The most number Typed is: " + number1);
			
		}
		else if(number2 > number1 && number2 > number3) {
			System.out.println("The most number Typed is: " + number2);
		}

		else {
			System.out.println("The most number is the 3rd Number: " + number3);
		}
	}
}
	
