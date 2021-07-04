package introducao.java01;

import java.util.Scanner;
//2. Faça um sistema que leia a idade de uma pessoa expressa em dias 
//e mostre-a expressa em anos, meses e dias. 

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int idadeDias, resultadoAnos, resultadoMeses, resultadoDias;
        
        System.out.println("Digite sua idade em dias: ");
        idadeDias = entrada.nextInt();
        
        resultadoAnos = idadeDias / 365;
                System.out.println(+ resultadoAnos + " anos, ");
        
        resultadoMeses = idadeDias % 365 / 30;
                System.out.println(+ resultadoMeses + " meses e ");
        
        resultadoDias = idadeDias % 365 % 30;
                System.out.println(resultadoDias + " dias de vida");

    }

}
