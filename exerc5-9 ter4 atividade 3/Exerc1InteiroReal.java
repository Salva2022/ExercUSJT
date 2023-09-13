/*
1. Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
somente termina.
 */
import java.util.Locale;
import java.util.Scanner;

public class Exerc1InteiroReal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número Inteiro: ");
        int inteiro = sc.nextInt();
        System.out.println("Digite o número Real: ");
        double real = sc.nextDouble();
        if (real > inteiro){
            System.out.println("O número Inteiro é menor que o número Real.");
        } else{
        }
        sc.close();
    }
}