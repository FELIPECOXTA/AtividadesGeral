package introducao.java01;

import java.util.Scanner;
//7. Um sistema de equações lineares do tipo: 
//, pode ser resolvido segundo mostrado abaixo : 
//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.


public class Exercicio07 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int A, B, C, D, E, F, x, y;
        
        System.out.println("Digte outro numero: ");
        A = entrada.nextInt();
        
        System.out.println("Digite outro numero: ");
        B = entrada.nextInt();
        
        System.out.println("Digite outro numero: ");
        C = entrada.nextInt();
        
        System.out.println("Digite outro numero: ");
        D = entrada.nextInt();
        
        System.out.println("Digite mais um numero: ");
        E = entrada.nextInt();
        
        System.out.println("Digite mais um numero: ");
        F = entrada.nextInt();
        
        x = ((C * E) - (B * F)) / ((A * E) - (B * D));
        y = ((A * F) - (C * D)) / ((A * E) - (B * D));
        
        System.out.println("O número do x é: " + x + "\nO número do y é: " + y);

    }

}
