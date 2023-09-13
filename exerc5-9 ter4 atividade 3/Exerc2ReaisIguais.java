/*
2. Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.
 */
import java.util.Scanner;

public class Exerc2ReaisIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número Real: ");
        double real1 = sc.nextDouble();
        System.out.println("Digite o segundo número Real: ");
        double real2 = sc.nextDouble();
        if (real1 == real2) {
            System.out.println("Os dois números reais são iguais.");
        } else{

        }
        sc.close();
    }
    
}