package vetoresematrizesjava0607;

//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[] arrayVetor = new int[5];
		int i, maior = 0;
		
		for (i = 0; i < arrayVetor.length; i++) {
			System.out.print("Insira o " + (i+1) + "º valor: ");
			arrayVetor[i] = read.nextInt();
			
			if(arrayVetor[i] > maior) {
				maior = arrayVetor[i];
			}
		}
		System.out.println("\nO maior valor digitado é: " + maior);
		read.close();
	}

}