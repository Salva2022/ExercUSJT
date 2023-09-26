/*
6. Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
saque.
 */
import javax.swing.JOptionPane;

public class Exerc6ContaSaqueJOptionPane {
    public static void main(String[] args) {
    double contaBancaria = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua conta bancária em R$:"));
    double valorSaque = Double.parseDouble (JOptionPane.showInputDialog("Digite o valor do saque em R$: "));
    double valorfinal = contaBancaria - valorSaque;
    if (valorfinal < 0) {
        JOptionPane.showMessageDialog(null,"Não foi possível realizar o saque." );
    } else {
        JOptionPane.showMessageDialog(null,"Saque Realizado !" + "\nValor remanescente na conta: R$ " +
        String.format("%.2f", valorfinal) + ".");
    }
    
    }
}