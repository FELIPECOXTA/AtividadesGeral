package introducao.java01;

import java.util.Scanner;
//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com 
//a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). 
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que 
//leia o custo de f�brica de um carro e escreva o custo ao consumidor. 


public class Exercicio08 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double precoCarro;
        
        System.out.println("Qual o valor do carro? : ");
        precoCarro = entrada.nextDouble();
        
        double distribuidor = (precoCarro * 28) / 100;
        double imposto = (precoCarro * 45) / 100;
        double precoFinal = precoCarro + distribuidor + imposto;
        
        System.out.println(precoFinal);

    }

}
