/*
3. Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”.
 */
import java.util.Scanner;

public class Exerc3MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primero número Inteiro: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número Inteiro: ");
        int numero2 = sc.nextInt();
        if (numero1 > numero2){
            System.out.println("Primeiro maior do que o segundo.");
        } else {
            System.out.println("Segundo maior do que o primeiro.");
        }
        sc.close();
    }
}