/*
2. Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina.
 */
import javax.swing.JOptionPane;

public class Exerc2ReaisIguaisJOptionPane {
    public static void main(String[] args) {
        double real1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número real: "));
        double real2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número real: "));
        if (real1 == real2){
            JOptionPane.showMessageDialog(null, "Os dois números reais são iguais.");
        } else {

        }
    }
}