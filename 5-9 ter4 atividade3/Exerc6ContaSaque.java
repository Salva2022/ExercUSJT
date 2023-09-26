/*
6. Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
saque.
 */
import java.util.Scanner;

public class Exerc6ContaSaque {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor da sua conta bancária em R$: ");
    double contaBancaria = sc.nextDouble();
    System.out.println("Digite o valor do saque em R$: ");
    double valorSaque = sc.nextDouble();
    double valorfinal = contaBancaria - valorSaque;
    if (valorfinal < 0) {
        System.out.println("Não foi possível realizar o saque." );
    } else {
        System.out.println("Saque Realizado !" + "\nValor remanescente na conta: R$ " +
        String.format("%.2f", valorfinal) + ".");
    }
    sc.close();
 }
    
}