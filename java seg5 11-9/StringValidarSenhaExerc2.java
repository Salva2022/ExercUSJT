import javax.swing.JOptionPane;
public class StringValidarSenhaExerc2 {

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

        if (primeiro == '1' || segundo == '1' || terceiro == '1' ||
        primeiro == '3' || segundo == '3' || terceiro == '3' ||
        primeiro == '5' || segundo == '5' || terceiro == '5' ||
        primeiro == '7' || segundo == '7' || terceiro == '7' ||
        primeiro == '9' || segundo == '9' || terceiro == '9' ) {
            JOptionPane.showMessageDialog(null, "Senha válida");
        } else {
            JOptionPane.showMessageDialog(null, "Senha inválida");
        }

    }
}