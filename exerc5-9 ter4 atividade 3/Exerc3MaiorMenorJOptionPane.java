/*
3. Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”.
 */
import javax.swing.JOptionPane;

public class Exerc3MaiorMenorJOptionPane {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, "Primeiro maior do que o segundo.");
        } else {
             JOptionPane.showMessageDialog(null, "Segundo maior do que o primeiro.");
        }
}
}