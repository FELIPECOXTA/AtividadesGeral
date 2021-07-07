package vetoresematrizesjava0607;

import java.util.Scanner;

public class Atividade01 {
	//Faça um programa que crie um vetor por leitura com 5 valores
	//de pontuação de uma atividade e o escreva em seguida. 
	//Encontre após a maior pontuação e a apresente. 

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int[] pontuacao = new int[5];
	int maiorPontuacao = 0;
	int contador; //ou i
	
	System.out.println("Digite cinco números: "); 
	
	for (contador = 0; contador < 5; contador++) { //for laço de repetição
		pontuacao [contador] = entrada.nextInt();
		
			if (pontuacao [contador] > maiorPontuacao) { //1 2 3 4 5 if else is e else laço de condição
		maiorPontuacao = pontuacao [contador];
		}		
	}
	for (contador = 0; contador < 5; contador++) {
		System.out.println(pontuacao [contador]);
	}
	System.out.println("A maior pontuação é: " + maiorPontuacao);

		entrada.close();
	
	
}
	}

