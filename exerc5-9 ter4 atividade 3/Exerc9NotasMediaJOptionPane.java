/*
9. Escreva um programa que lê duas notas de um estudante, ambas sendo valores reais. O programa deve calcular a
média e exibir um texto para o usuário conforme a tabela a seguir:
Nota Texto
média >= 9 Parabéns, continue assim!
7 <= média < 9 Aprovado.
6 <= média < 7 Aprovado no limite, estude um pouco mais.
2 < = média < 6 Não está aprovado mas ainda pode fazer a segunda época
média < 2 Reprovado. Nos vemos semestre que vem.
 */
import javax.swing.JOptionPane;

public class Exerc9NotasMediaJOptionPane {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double media = (nota1 + nota2) / 2;
        if (media < 2) {
            JOptionPane.showMessageDialog(null, "Reprovado. Nos vemos semestre que vem.");
        } else  if (media >= 2 && media < 6) {
            JOptionPane.showMessageDialog(null, "Não está aprovado mas ainda pode fazer a segunda época.");
        } else  if (media >= 6 && media < 7) {
            JOptionPane.showMessageDialog(null, "Aprovado no limite, estude um pouco mais.");
        } else  if (media >= 7 && media < 9) {
            JOptionPane.showMessageDialog(null, "Aprovado.");
        } else  {
            JOptionPane.showMessageDialog(null, "Parabéns, continue assim!");
        } 
    }
}