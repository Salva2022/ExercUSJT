/*
7. Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
0 – Compra à vista
1 – Compra parcelada no cartão
2 – Crediário
Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e
terminar.
 */
import java.util.Scanner;

public class Exerc7CompraRoupa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da roupa em R$:");
        double valorReal = sc.nextDouble();
        System.out.println("Escolha o número correspondente a opção de pagamento: " + 
        "\n0-Compra à vista" + "\n1-Compra parcelada no cartão" + "\n2-Crediário");
        int escolha = sc.nextInt();
        double desconto = ((1d/10) * valorReal);
        double valor0 = valorReal - desconto;
        
        switch (escolha) {
            case 0:
                System.out.println("Pagamento à vista selecionado. Valor de: R$" + String.format("%.2f",valor0)+".");
                break;
            case 1:
                System.out.println("Digite a quantidade de parcelas: ");
                int parcelas1 = sc.nextInt();
                double valor1 = valorReal / parcelas1;
                System.out.println("Parcelamento realizado em " + parcelas1 +" vezes de R$" + String.format("%.2f",valor1 )+ ".");
                break;
            case 2:
                System.out.println("Digite a quantidade de parcelas: ");
                int parcelas2 = sc.nextInt();
                double juros = (1.0/10) * valorReal;
                double valor2 = juros +valorReal;
                double valor2parcelado = valor2 / parcelas2;
                System.out.println("Parcelamento realizado em " + parcelas2 +" vezes de R$" +
                String.format("%.2f",valor2parcelado )+ ".");
                break;
        
            default:
                System.out.println("Opção Inválida");
                sc.close();
        }
    }    
}