import javax.swing.JOptionPane;
public class ValidarSenhaString {

    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite a senha:");
        if (senha.length() != 4){
            JOptionPane.showMessageDialog(null, "Senha deve possuir 4 caracteres.");
        }
        if (!(senha.charAt(0) == 'A' || senha.charAt(0) == 'a')){
        JOptionPane.showMessageDialog(null, "Primeiro caractere deve ser a ou A.");

        }
        char primeiro = senha.charAt(1);
        char segundo = senha.charAt(2);
        char terceiro = senha.charAt(3);

        if (ehImpar(primeiro) || ehImpar(segundo) || ehImpar(terceiro)) {
            JOptionPane.showMessageDialog(null, "Senha válida");
        } else {
            JOptionPane.showMessageDialog(null, "Senha inválida");
        }

    }
    public static boolean ehImpar(char d){
        return d == '1' || d == '3' || d =='5' || d == '7' || d == '9';
    }
}