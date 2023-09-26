/*
11. Faça um programa que lê os seguintes dados:
- código de estado (um inteiro de 1 a 5)
- valor inicial de carga
Seu programa deve calcular qual o valor final de uma carga de acordo com as seguintes regras.
Caso o código de estado seja 2 ou 5 o valor final da carga é o valor inicial menos 12%.
Caso o código de estado seja 1, 3 ou 4, o valor final da carga é o valor inicial menos 15%.
 */
import java.util.Scanner;

public class Exerc11Carga  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Digite o código: ");
    int codigo = sc.nextInt();
    System.out.println("Digite o valor da carga: ");
    double carga = sc.nextDouble();
    double menosum = carga * 0.15;
    double resultadoum = carga - menosum;
    double menosdois  = carga * 0.12;
    double resultadodois = carga - menosdois;
    double menostres  = carga * 0.15;
    double resultadotres = carga - menostres;
    double menosquatro = carga * 0.15;
    double resultadoquatro = carga - menosquatro;
    double menoscinco = carga * 0.12;
    double resultadocinco = carga - menoscinco;

    switch (codigo){
        case 1:
        System.out.println("Valor final de: " + resultadoum);
            break;
        case 2:
        System.out.println("Valor final de: " + resultadodois);
            break;
        case 3:
        System.out.println("Valor final de: " + resultadotres);
            break;
        case 4:
        System.out.println("Valor final de: " + resultadoquatro);
            break;
        case 5:
        System.out.println("Valor final de: " + resultadocinco);
            break;
        default:
        sc.close();    
    }    
    }
    
}
