/*
5. Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números.
 */
import java.util.Scanner;

public class Exerc5TresInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número Inteiro: ");
        int inteiro1 = sc.nextInt();
        System.out.println("Digite o segundo número Inteiro: ");
        int inteiro2 = sc.nextInt();
        System.out.println("Digite o terceiro número Inteiro: ");
        int inteiro3 = sc.nextInt();
        int soma = inteiro1 + inteiro2 + inteiro3;
        int media = (inteiro1 + inteiro2 + inteiro3) / 3;
        int produto = inteiro1 * inteiro2 * inteiro3;
        int maiorIntermediario = inteiro1 > inteiro2 ? inteiro1 : inteiro2;
        int maior = inteiro3 > maiorIntermediario ? inteiro3 : maiorIntermediario;
        int menorIntermediario = inteiro1 < inteiro2 ? inteiro1 : inteiro2;
        int menor = inteiro3 < menorIntermediario ? inteiro3 : menorIntermediario;
        System.out.println("Soma dos números: " + soma + "\nMédia dos números: " + media + 
        "\nProduto dos números: " + produto + "\nO maior número: " + maior + "\nO menor número: " + menor);
        sc.close();
        }
       
    }