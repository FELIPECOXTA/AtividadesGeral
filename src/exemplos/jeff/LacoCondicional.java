package exemplos.jeff;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  entrada = new Scanner(System.in);
		
		double nota1 = 0; 
		double nota2 = 0;
		double media = 0;
		
		//Escreva
		System.out.println("Escreva a 1ª nota");
		nota1 = entrada.nextDouble();
		
		System.out.println("Escreva a 2ª nota");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.01
				) {
		System.out.println("\nAprovado" +"\nMédia" + media);
		
		
		} 
		else if(media >= 3.0 && media <6.0) {
			
		
		
		}
		
		
				
				
			
		}
		
		
		
		
	}



