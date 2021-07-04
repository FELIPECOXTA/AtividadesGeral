package lacos.de.decisao;

import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

public class LacosDeDecisao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int number;
		int answer;
		
		System.out.println("Type it a number: ");
		number = read.nextInt();
		answer = number % 2;
		
		if(answer == 0) {
			System.out.println("Your number is even: ");
			System.out.println(Math.sqrt(number));
		}
		else {
			System.out.println("Your number is odd: ");
			System.out.println(Math.pow(number, 2));
		}
		
	}

}
