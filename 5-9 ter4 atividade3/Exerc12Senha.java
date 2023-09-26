/*
12. Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3.
 */
import java.util.Scanner;

public class Exerc12Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiro = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundo = sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        int terceiro = sc.nextInt();
        System.out.println("Digite o quarto número: ");
        int quarto = sc.nextInt();
        if (primeiro == 8 || primeiro == 5){
        if (quarto == 5 && segundo + terceiro == 3 || quarto == 1 && segundo + terceiro == 0){
            System.out.println("Número de quatro dígitos é uma senha válida.");
        } else {
            System.out.println("Número de quatro dígitos é uma senha inválida.");
        }
        } else
         System.out.println("Número de quatro dígitos é uma senha inválida.");
        sc.close();
    }
}
// as seguintes condições devem ser obedecidas:
// O valor "primeiro" deve ser igual a 8 ou 5.
// O valor "quarto" deve ser igual a 5 ou 1.
// Caso o valor "quarto" seja igual a 5, a soma dos valores "segundo" e "terceiro" devem ser igual a 3. Caso o valor "quarto" seja igual a 1,
// os valores "segundo" e "terceiro" somados devem ser iguais a 0.
//Quatro cenários foram testados para estas exigências:
// 1) A senha inicia com o valor 8 e termina com o valor 5, obtendo as seguintes respostas: (8125,8215,8305,8035).
// 2) A senha inicia com o valor 8 e termina com o valor 1, obtendo as seguintes respostas: (8001).
// 2) A senha inicia com o valor 5 e termina com o valor 5, obtendo as seguintes respostas: (5125,5215,5305,5035).
// 2) A senha inicia com o valor 5 e termina com o valor 1, obtendo as seguintes respostas: (5001).
//São 10 posssibilidades de senhas no total.