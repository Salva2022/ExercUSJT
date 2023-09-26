import javax.swing.JOptionPane;
import java.util.Scanner;

public class QuatroNumerosUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = Double.parseDouble (JOptionPane.showInputDialog ("Digite o primeiro número: "));
        double n2 = Double.parseDouble (JOptionPane.showInputDialog ("Digite o segundo número: "));
        double n3 = Double.parseDouble (JOptionPane.showInputDialog ("Digite o terceiro número: "));
        double n4 = Double.parseDouble (JOptionPane.showInputDialog ("Digite o quarto número: "));
        double q1 = n1 *n1;
        double q2 = n2 *n2;
        double q3 = n3 *n3;
        double q4 = n4 *n4;
        double soma = q1 + q2 + q3 + q4;
        JOptionPane.showMessageDialog(null, "O valor das somas dos quadrados é de: " + soma );
        sc.close();
    }   

}