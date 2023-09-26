/*
12. Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3.
 */
import javax.swing.JOptionPane;

public class Exerc12SenhaJOptionPane {
    public static void main(String[] args) {
        int primeiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int segundo = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int terceiro = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: "));
        if (primeiro == 8 || primeiro == 5){
        if (quarto == 5 && segundo + terceiro == 3 || quarto == 1 && segundo + terceiro == 0){
            JOptionPane.showMessageDialog(null, "Número de quatro dígitos é uma senha válida.");
        } else {
            JOptionPane.showMessageDialog(null, "Número de quatro dígitos é uma senha inválida.");
        }
        } else
            JOptionPane.showMessageDialog(null, "Número de quatro dígitos é uma senha inválida.");
    }
}