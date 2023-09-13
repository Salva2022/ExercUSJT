/*
8. Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
O programa deve exibir um texto para o usuário conforme a tabela abaixo:

IMC Texto
Abaixo de 18,5 Abaixo do peso ideal.
Entre 18,5 e 24,9 Peso ideal, muito bem.
Entre 25,0 e 29,9 Sobrepeso, um regime leve pode ajudar.
Entre 30,0 e 34,9 Obesidade leve.
Entre 35,0 e 39,9 Obesidade moderada.
Acima de 40 Obesidade mórbida.
 */
import java.util.Scanner;

public class Exerc8IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.println("Defina sua altura (em m): ");
        double altura = sc.nextDouble();
        double alturaelevada = altura * altura;
        double imc = peso / alturaelevada;
        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else if ((imc >= 18.5) && (imc <= 24.9)) {
            System.out.println("Peso ideal, muito bem.");
        } else if ((imc >= 25.0) && (imc <= 29.9)) {
            System.out.println("Sobrepeso, um regime leve pode ajudar.");
        } else if ((imc >= 30.0) && (imc <= 34.9)) {
            System.out.println("Obesidade Leve.");
        } else if ((imc >= 35.0) && (imc <= 39.9)) {
            System.out.println("Obesidade Moderada.");
        } else
            System.out.println("Obesidade Mórbida.");
            sc.close();
        } 
    }
