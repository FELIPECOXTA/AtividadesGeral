package exemplos.jeff;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  entrada = new Scanner(System.in);
		
		double numero1;
		double numero2;
		char operacao;
		double resultado =0.0;
		
		System.out.println("Digite o 1� N�mero:");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite a opera��o:");
		operacao = entrada.next().charAt(0);
		
		System.out.println("Digite o 2� N�mero:");
		numero2 = entrada.nextDouble();
	
		
		if(operacao == '+') {
			resultado = numero1 + numero2;
		}
		else if(operacao == '-') {
			resultado = numero1 - numero2;
		}	
		else if(operacao == '*') {
			resultado = numero1 * numero2;
		}
		else if(operacao == '/') {
			resultado = numero1 / numero2;
		}
		
		System.out.println("Resultado: " + resultado);
		
	}
}
		
		
		
		
		





