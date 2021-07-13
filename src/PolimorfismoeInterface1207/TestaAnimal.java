package PolimorfismoeInterface1207;

public class TestaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro meuCachorro = new Cachorro();
		Cavalo meuCavalo = new Cavalo();
		Preguica minhaPreguica = new Preguica();
		
		meuCachorro.nome();
		meuCachorro.idade();
		meuCachorro.emitirSom();
		meuCachorro.habilidade();
		
		meuCavalo.nome();
		meuCavalo.idade();
		meuCavalo.emitirSom();
		meuCavalo.habilidade();
		
		
		minhaPreguica.nome();
		minhaPreguica.idade();
		minhaPreguica.emitirSom();
		minhaPreguica.habilidade();

	}

}
