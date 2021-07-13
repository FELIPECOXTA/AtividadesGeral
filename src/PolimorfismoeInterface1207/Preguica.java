package PolimorfismoeInterface1207;

public class Preguica implements Animal {

	@Override
	public void nome() {
		System.out.println("Nome da Preguiça: Anna ");
		
	}

	@Override
	public void idade() {
		System.out.println("idade da preguiça: 4");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som: estranho ");
		
	}

	@Override
	public void habilidade() {
		System.out.println("Habilidade da Preguiça : subir em árvore");
		
	}

}
