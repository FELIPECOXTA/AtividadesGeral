package PolimorfismoeInterface1207;

public class Cachorro implements Animal {
	
				

				@Override
				public void nome() {
					System.out.println("Nome do Cachorro: Nikki"); 
					
				}

				@Override
				public void idade() {
					System.out.println("Idade do Cachorro: 7");
					
				}

				@Override
				public void emitirSom() {
					System.out.println("Som do Cachorro: Au au");
				}
					
				

				@Override
				public void habilidade() {
					System.out.println("Habilidade do cachorro: Correr\n");
					
				}
					

}
