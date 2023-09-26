/*
4. Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
números são iguais”.
 */
import java.util.Scanner;

public class Exerc4MaiorIgual {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double numero2 = sc.nextDouble();
        if (numero1 == numero2){
            System.out.println( "Estes números são iguais.");
        } else if(numero1 > numero2){
            System.out.println( numero1 + " é o maior.");
        } else {
            System.out.println( numero2 + " é o maior.");
        }
        sc.close();
    }  
}

