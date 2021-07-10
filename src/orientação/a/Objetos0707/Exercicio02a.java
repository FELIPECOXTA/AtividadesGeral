package orientação.a.Objetos0707;

//Crie uma classe avião e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto avião, defina as instancias deste
//objeto e apresente as informações deste objeto no console.

import java.util.Scanner;

public class Exercicio02a {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//criando objeto aviao
		Exercicio02b aviao = new Exercicio02b();
		
		System.out.print("Digite o modelo do avião (BOEING = 1 | JATO = 2): ");
		aviao.modelo = read.nextInt();
		
		System.out.print("Digite a quantidade de passageiros: ");
		aviao.quantidadePassageiro = read.nextInt();
		
		System.out.print("Digite o tempo de voo: ");
		aviao.tempoVoo = read.nextDouble();
		
		System.out.print("Digite o volume inicial de combustível: ");
		aviao.combustivelInicio = read.nextDouble();
		
		//chamando o método "COMBUSTIVEL" de "Exercicio02b"
		aviao.combustivel();
		
		read.close();

	}

}
