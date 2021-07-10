package sobrecargametodos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calcRetorno = new MinhaCalculadora();
		
		//Soma dois numeros inteiros
		System.out.println(calcRetorno.soma(10, 20));
		System.out.println(calcRetorno.soma(25.80, 80.9));
		System.out.println(calcRetorno.soma(1, 2, 3));
	}

}
