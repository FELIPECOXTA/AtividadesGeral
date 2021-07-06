package exercicios.de.repeticao0507;

import java.util.Scanner;

public class Atividade06 {
	//6Escrever um programa que receba vários números inteiros no teclado.
	// E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x = 1, soma = 0, qtdeMultiplo = 0;
		
		do {
			System.out.println("Digite um número: ");
			x = input.nextInt();
			
			if(x % 3 == 0 && x != 0) {
				qtdeMultiplo++;
				soma += x;
			}
		}
		while(x != 0);
		
		System.out.println("Media Multiplo de 3: " + soma / qtdeMultiplo);
	}

}

