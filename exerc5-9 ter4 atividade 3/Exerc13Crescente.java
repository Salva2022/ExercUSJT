/*
13. Escreva um programa que lê três números inteiros diferentes e os exibe em ordrescente. Se o usuário digitar
números iguais, seu programa deve exibir uma mensagem de erro e terminar.
 */
import java.util.Scanner;

public class Exerc13Crescente {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro número: ");
    int numero1 = sc.nextInt();
    System.out.println("Digite o segundo número: ");
    int numero2 = sc.nextInt();
    System.out.println("Digite o terceiro número: ");
    int numero3 = sc.nextInt();
    if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3) {
        System.out.println("Erro.");
    } else if(numero1 < numero2 && numero1 < numero3 && numero2 < numero3){
        System.out.println(numero1 + "," + numero2 + "," + numero3);
    } else if(numero1 < numero3 && numero1 < numero2 && numero3 < numero2){
        System.out.println(numero1 + "," + numero3 + "," + numero2);
    } else if(numero2 < numero1 && numero2 < numero3 && numero1 < numero3){
        System.out.println(numero2 + "," + numero1 + "," + numero3);
    } else if(numero2 < numero3 && numero2 < numero1 && numero3 < numero1){
        System.out.println(numero2 + "," + numero3 + "," + numero1);
    } else if(numero3 < numero1 && numero3 < numero2 && numero1 < numero2){
        System.out.println(numero3 + "," + numero1 + "," + numero2);
    } else if(numero3 < numero2 && numero3 < numero1 && numero2 < numero1){
         System.out.println(numero3 + "," + numero2 + "," + numero1);
    }
    sc.close();
    } 
}   
