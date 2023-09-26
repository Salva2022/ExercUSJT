import javax.swing.JOptionPane;

public class HelloWorldsoma {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        double primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        double resultado = primeiroValor - segundoValor;
        JOptionPane.showMessageDialog(null, nome + " a subtração é " + resultado);
    }
}