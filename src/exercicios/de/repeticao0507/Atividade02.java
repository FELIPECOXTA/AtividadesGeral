package exercicios.de.repeticao0507;

import java.util.Scanner;

public class Atividade02 {
	
	//2.Ler 10 n�meros e imprimir quantos s�o pares e
	//quantos s�o �mpares. (FOR)
	
	public static void main(String[] args) {
		int par=0;
		int impar=0;
		int numeroUsuario;
		
		Scanner entrada = new Scanner(System.in);
		
		for(int numero=1; numero <=10; numero++ ) {
			System.out.println("Digite o n�mero escolhido: ");
			numeroUsuario = entrada.nextInt();
			if(numeroUsuario % 2 == 0) {
				par++;
			}
			else {
				impar++;
				
			}
		}
		
		System.out.println("A total de n�meros pares foi: " + par );
		System.out.println("A total de n�meros impares foi: " + impar );
		entrada.close();
		
	}
 	}