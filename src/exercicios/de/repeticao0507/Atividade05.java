package exercicios.de.repeticao0507;


import java.util.Scanner;

public class Atividade05 {

	//5Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
	
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero, armazenagem = 0;

        do {
            System.out.print("Informe um n� para a soma (quando desejar finalizar a soma digite 0): ");
            numero = reader.nextInt();
            armazenagem += numero;
        }
        while(numero != 0);

        System.out.println("A soma dos n�meros digitados �: " + armazenagem);

        reader.close();
    }

}