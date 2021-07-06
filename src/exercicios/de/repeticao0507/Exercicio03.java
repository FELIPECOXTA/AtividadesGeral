package exercicios.de.repeticao0507;

import java.util.Scanner;

public class Exercicio03 {
	
	//3.Solicitar a idade de várias pessoas e imprimir: Total de pessoas
	//com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina 
	//quando idade for =-99. (WHILE)

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int idade = 0, menor = 0, maior = 0;

        while (idade != -99) {
            System.out.println("Digite uma idade: ");
            idade = ler.nextInt();

            if(idade > 0 && idade < 21) {
                menor++;
                System.out.println("Menos de 21!!!");
            }
                else if(idade > 50) {
                    maior++;
                    System.out.println("Mais de 50!!!");
                }
                else {
                    System.out.println("Fora da contagem!!!");
                }

        }
            System.out.println("Quantidade de pessoas com menos de 21 anos: " + menor);
            System.out.println("\nQuantidade de pessoas com mais de 50 anos: " + maior);
    }

}