/*
5. Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números.
 */
import javax.swing.JOptionPane;

public class Exerc5TresInteirosJOptionPane {
    public static void main(String[] args) {
        int inteiro1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int inteiro2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int inteiro3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        int soma = inteiro1 + inteiro2 + inteiro3;
        int media = (inteiro1 + inteiro2 + inteiro3) / 3;
        int produto = inteiro1 * inteiro2 * inteiro3;
        int maiorIntermediario = inteiro1 > inteiro2 ? inteiro1 : inteiro2;
        int maior = inteiro3 > maiorIntermediario ? inteiro3 : maiorIntermediario;
        int menorIntermediario = inteiro1 < inteiro2 ? inteiro1 : inteiro2;
        int menor = inteiro3 < menorIntermediario ? inteiro3 : menorIntermediario;
        JOptionPane.showMessageDialog(null, "Soma dos números: " + soma + "\nMédia dos números: " + media + 
        "\nProduto dos números: " + produto + "\nO maior número: " + maior + "\nO menor número: " + menor);
    }
}
