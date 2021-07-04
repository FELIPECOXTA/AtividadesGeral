package lacos.de.decisao;

import java.util.Scanner;

//3.0 Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
//10-14 infantil
//15-17 juvenil
//18-25 adulto

public class LacoDeDecisao03 {

	public static void main(String[] args) {
		
	int age;
	
	Scanner read = new Scanner(System.in);
	
	System.out.println("Type it your age: ");
	age = read.nextInt();
	
	if(age >= 10 && age <=14) {
		System.out.println("Childrens category");
	}
	else if (age >= 15 && age <= 17) {
		System.out.println("Youth category");
	}
	else if (age >= 18 && age <=25) {
		System.out.println("Adult categoty");
	}
	else {
		System.out.println("Invalid categoty");
	}

}
}
