/*
1. Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa somente termina.
*/
import javax.swing.JOptionPane;
public class exemplo1{
public static void main(String[] args) {
int inteiro = Integer.parseInt(JOptionPane.showInputDialog ("Digite o número Inteiro: "));
double real = Double.parseDouble(JOptionPane.showInputDialog ("Digite o número Real: "));
if (real > inteiro) {
JOptionPane.showMessageDialog(null, "O número Inteiro é menor que o número Real.");
} else {
}
}
}