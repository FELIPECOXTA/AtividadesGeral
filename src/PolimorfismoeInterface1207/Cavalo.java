package PolimorfismoeInterface1207;

public class Cavalo implements Animal {

	@Override
	public void nome() {
		System.out.println("Nome do Cavalo: Henryk");
		
	}

	@Override
	public void idade() {
		System.out.println("Idade do Cavalo: 2");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Som do Cavalo: iriririri");
		
	}

	@Override
	public void habilidade() {
		System.out.println("Habilidade do Cavalo: Correr\n");
		
	}

}
