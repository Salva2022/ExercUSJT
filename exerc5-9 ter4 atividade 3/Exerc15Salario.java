/*
15. Faça um programa que lê os seguintes dados:
- valor/hora (é um número real positivo)
- horas trabalhadas (é um inteiro)
- imposto (um real entre 0 e 1, inclusive)
- comissão (é um real positivo)
Seu programa deve calcular e exibir para o usuário os seguintes valores:
Salário bruto, que é igual ao valor/hora multiplicado pelo número de horas trabalhadas.
Salário líquido, que é igual ao salário bruto menos o imposto mais a comissão. Note que a comissão somente
entrará nos cálculos caso o número de horas trabalhadas seja pelo menos 120.
 */
import java.util.Scanner;

public class Exerc15Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Defina o valor/hora em R$: ");
        double valorhora = sc.nextDouble();
        System.out.println("Defina o número de horas trabalhadas: ");
        int horastrabalhadas = sc.nextInt();
        System.out.println("Defina um valor de 0 a 1 para o imposto: ");
        double imposto = sc.nextDouble();
        double salariobruto = valorhora * horastrabalhadas;
        double salarioliquido = salariobruto - (salariobruto * imposto);
        
        if (horastrabalhadas < 120) {
        System.out.println("Salário líquido é de R$: " + String.format("%.2f",salariobruto) + "." + 
        "\nSalário bruto é de R$: " + String.format("%.2f",salarioliquido) + ".");
        } else{
            System.out.println("Defina o valor de comissão R$: ");
            double comissao = sc.nextDouble();
            double salarioliquido2 = salariobruto - (salariobruto * imposto) + comissao;
        System.out.println("Salário líquido é de R$: " + String.format("%.2f",salariobruto) + "." + 
        "\nSalário bruto é de R$: " + String.format("%.2f",salarioliquido2) + ".");
        }
        sc.close();
    }
}