package lacos.de.decisao;

import java.util.Scanner;

public class LacoDeDecisao {

	//2.0 Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner read = new Scanner(System.in);
		int number1;
       	int number2;
		int number3;
		
		System.out.println("Write the 1st number; ");
			number1 = read.nextInt();
			
			System.out.println("Write the 2nd number; ");
			number2 = read.nextInt();
			
			System.out.println("Write the 3rd number; ");
			number3 = read.nextInt();
			
			
			if (number1 > number2 && number1 > number3) {
				if (number2 > number3); {
				System.out.println("The ascending order is: " + number3 + "," + number2 + "," + number1); }
			}
				
				
			else if(number3 > number2) {
				System.out.println("The ascending order is: " + number2 + "," + number3 + "," + number1);			
			}
			else if (number2 > number1 && number2 > number3) {
				if (number1 > number3) {
				System.out.println("The ascending order is: " + number3 + "," + number1 + "," + number2);
			}
				else if(number3 > number1) {
			}
				
			else if(number3 > number1 && number3 >number2) {				
				if(number2 > number1) {
				System.out.println("The ascending order is: " + number1 +"," + number2 + "," + number3);
				
			}
				else if (number1 > number2) {
				System.out.println("The ascending order is: " + number2 + "," + number1 + "," + number3);
				
			  }

	      }   
		}
	}
}

			
			
				
				
	


