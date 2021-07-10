package orientação.a.Objetos0707;

public class Exercicio02b {
	
	int modelo;
	int quantidadePassageiro;
	double tempoVoo, combustivelInicio, combustivelFinal;
	
	//definindo METODO "COMBUSTIVEL"
	void combustivel () {
		
		//adicionando condições para determinar volume de combustivel a ser abastecido na aeronave
		if (modelo == 1 && tempoVoo > 15.0 && quantidadePassageiro > 150) {
			combustivelFinal = (tempoVoo*75) + (quantidadePassageiro*2) - combustivelInicio;
		}
		else if (modelo == 1 && tempoVoo < 15.0 && quantidadePassageiro < 150 && quantidadePassageiro > 50) {
			combustivelFinal = (tempoVoo*65) + (quantidadePassageiro*1.75) - combustivelInicio;
		}
		else if (modelo == 1 && tempoVoo < 15.0 && quantidadePassageiro > 150) {
			combustivelFinal = (tempoVoo*60) + (quantidadePassageiro*1.75) - combustivelInicio;
		}	
		else if (modelo == 1 && tempoVoo < 15.0 && quantidadePassageiro < 50)  {
			combustivelFinal = (tempoVoo*55) + (quantidadePassageiro*1.50) - combustivelInicio;
		}
		else if (modelo == 2 && tempoVoo > 15.0 && quantidadePassageiro > 15) {
			combustivelFinal = (tempoVoo*25) + (quantidadePassageiro*1) - combustivelInicio;
		}
		else if (modelo == 2 && tempoVoo < 15.0 && quantidadePassageiro > 15) {
			combustivelFinal = (tempoVoo*20) + (quantidadePassageiro*1) - combustivelInicio;
		}
		else if (modelo == 2 && tempoVoo < 15.0 && quantidadePassageiro < 15 && quantidadePassageiro > 5) {
			combustivelFinal = (tempoVoo*15) + (quantidadePassageiro*0.80) - combustivelInicio;
		}
		else if (modelo == 2 && tempoVoo < 15.0 && quantidadePassageiro < 5)  {
			combustivelFinal = (tempoVoo*10) + (quantidadePassageiro*0.60) - combustivelInicio;
		}
		else {
			System.out.println("\nTabela apenas para BOEING e JATO! Conculte outra tabela!");
		}
		System.out.println("\nÉ preciso abastecer " + Math.round(combustivelFinal) + " litros para esta viagem.");
}
}