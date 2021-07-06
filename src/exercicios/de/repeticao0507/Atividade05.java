package exercicios.de.repeticao0507;


import java.util.Scanner;

public class Atividade05 {

	//5Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	//No final, mostre a soma dos números digitados.(DO...WHILE)
	
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int numero, armazenagem = 0;

        do {
            System.out.print("Informe um nº para a soma (quando desejar finalizar a soma digite 0): ");
            numero = reader.nextInt();
            armazenagem += numero;
        }
        while(numero != 0);

        System.out.println("A soma dos números digitados é: " + armazenagem);

        reader.close();
    }

}