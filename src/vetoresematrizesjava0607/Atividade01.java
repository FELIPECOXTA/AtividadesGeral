package vetoresematrizesjava0607;

import java.util.Scanner;

public class Atividade01 {
	//Fa�a um programa que crie um vetor por leitura com 5 valores
	//de pontua��o de uma atividade e o escreva em seguida. 
	//Encontre ap�s a maior pontua��o e a apresente. 

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int[] pontuacao = new int[5];
	int maiorPontuacao = 0;
	int contador; //ou i
	
	System.out.println("Digite cinco n�meros: "); 
	
	for (contador = 0; contador < 5; contador++) { //for la�o de repeti��o
		pontuacao [contador] = entrada.nextInt();
		
			if (pontuacao [contador] > maiorPontuacao) { //1 2 3 4 5 if else is e else la�o de condi��o
		maiorPontuacao = pontuacao [contador];
		}		
	}
	for (contador = 0; contador < 5; contador++) {
		System.out.println(pontuacao [contador]);
	}
	System.out.println("A maior pontua��o �: " + maiorPontuacao);

		entrada.close();
	
	
}
	}

