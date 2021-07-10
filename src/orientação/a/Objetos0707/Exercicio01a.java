package orientação.a.Objetos0707;

import java.util.Scanner;

public class Exercicio01a {

	//Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		//criando objeto c1 --> CLIENTE
		Exercicio01b c1 = new Exercicio01b();
		
		System.out.println("Para saber se você tem um voucher disponível, informe seus dados: \n");
		
			//solicitando dados ao usuário
			System.out.print("Digite o seu nome: ");
			c1.nome = read.nextLine();
			
			System.out.print("Digite o seu email: ");
			c1.email = read.nextLine();
			
			System.out.print("Digite a sua categoria (NORMAL = 1; VIP = 2): ");
			c1.categoria = read.nextInt();
			
			System.out.print("Digite o seu método de pagamento (DINHEIRO = 1; CARTÃO = 2): ");
			c1.metodoPagamento = read.nextInt();
			
			//chamando o método VOUCHER de "Exercicio01b"
			c1.voucher();
			
			read.close();

	}

}


