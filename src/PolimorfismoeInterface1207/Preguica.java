package PolimorfismoeInterface1207;

public class Preguica implements Animal {

	@Override
	public void nome() {
		System.out.println("Nome da Pregui�a: Anna ");
		
	}

	@Override
	public void idade() {
		System.out.println("idade da pregui�a: 4");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("som: estranho ");
		
	}

	@Override
	public void habilidade() {
		System.out.println("Habilidade da Pregui�a : subir em �rvore");
		
	}

}
