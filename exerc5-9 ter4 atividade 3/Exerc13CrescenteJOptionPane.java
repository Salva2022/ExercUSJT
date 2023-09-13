/*
13. Escreva um programa que lê três números inteiros diferentes e os exibe em ordrescente. Se o usuário digitar
números iguais, seu programa deve exibir uma mensagem de erro e terminar.
 */
import javax.swing.JOptionPane;

public class Exerc13CrescenteJOptionPane {
     public static void main(String[] args) {
    
    int numero1 = Integer.parseInt (JOptionPane.showInputDialog("Digite o primeiro número: "));
    int numero2 = Integer.parseInt (JOptionPane.showInputDialog("Digite o segundo número: "));
    int numero3 = Integer.parseInt (JOptionPane.showInputDialog("Digite o terceiro número: "));
    if (numero1 == numero2 || numero2 == numero3 || numero1 == numero3) {
        JOptionPane.showMessageDialog(null, "Erro.");
    } else if(numero1 < numero2 && numero1 < numero3 && numero2 < numero3){
        JOptionPane.showMessageDialog(null, numero1 + "," + numero2 + "," + numero3);
    } else if(numero1 < numero3 && numero1 < numero2 && numero3 < numero2){
        JOptionPane.showMessageDialog(null, numero1 + "," + numero3 + "," + numero2);
    } else if(numero2 < numero1 && numero2 < numero3 && numero1 < numero3){
        JOptionPane.showMessageDialog(null, numero2 + "," + numero1 + "," + numero3);
    } else if(numero2 < numero3 && numero2 < numero1 && numero3 < numero1){
        JOptionPane.showMessageDialog(null, numero2 + "," + numero3 + "," + numero1);
    } else if(numero3 < numero1 && numero3 < numero2 && numero1 < numero2){
        JOptionPane.showMessageDialog(null, numero3 + "," + numero1 + "," + numero2);
    } else if(numero3 < numero2 && numero3 < numero1 && numero2 < numero1){
        JOptionPane.showMessageDialog(null, numero3 + "," + numero2 + "," + numero1);
    }
    } 
}
