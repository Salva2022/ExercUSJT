import javax.swing.JOptionPane;

public class StringsLenght {
    public static void main(String[] args) {
        //verifica o comprimento dfe uma string
        String s = JOptionPane.showInputDialog("Digite uma string");
        int comprimento = s.length();
        JOptionPane.showMessageDialog(null, s + " tem " + comprimento +" caracteres.");
    }
}
