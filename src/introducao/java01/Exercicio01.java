package introducao.java01;

import java.util.Scanner;
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
//meses e dias e mostre-a expressa apenas em dias. 

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int anos, meses, dias, resultado;
        
        System.out.println("Digite a sua idade em anos: ");
        anos = entrada.nextInt();
        
        System.out.println("Digite sua idade em meses: ");
        meses = entrada.nextInt();
        
        System.out.println("Digite sua idade em dias: ");
        dias = entrada.nextInt();
        
        resultado = ((anos * 365) + (meses * 30) + dias);
        System.out.println("Você tem " + resultado + " dias de vida");

    }

}
