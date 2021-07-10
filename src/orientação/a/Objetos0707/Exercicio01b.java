package orientação.a.Objetos0707;

public class Exercicio01b {
	
	//definindo atributos para o cliente
	String nome;
	String email;
	//CATEGORIA: separada em NORMAL/VIP
	int categoria;
	//METODOS: DINHEIRO/CARTÃO
	int metodoPagamento;
	
	//definindo METODO "VOUCHER"
	void voucher() {
		
		//criando condições para distribuir vouchers de valores diferentes (quando aplicável)
		if (categoria == 2 && metodoPagamento == 2 ) {
			System.out.println("\nOlá, " + nome + ". Verificamos seu email " + email 
					+ " e você receberá um voucher de R$100,00!!!");

		}
		else if (categoria == 1 && metodoPagamento == 2) {
			System.out.println("\nOlá, " + nome + ". Verificamos seu email " + email 
					+ " e você receberá um voucher de R$50,00!!!");
		}
		else {
		
		System.out.println("\nOlá, " + nome + ". Verificamos seu email " + email 
				+ " e você não tem direito ao voucher... continue comprando para acumular pontos!!!");
		}
	
	}
		

}
