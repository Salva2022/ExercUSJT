import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;

public class GerenciadorAlunos extends JFrame {

    private static Font font = new Font("Arial", Font.BOLD, 22);
    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();
        ga.desenhar();
}

        public void desenhar(){
            this.setSize(610,210);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel painel = new JPanel();
            this.add(painel);
            painel.add(criarLoginLabel());
            JTextField login = new JTextField(30);
            login.setFont(font);
            painel.add(login);
            JLabel senhaLabel = new JLabel("Senha");
            painel.add(senhaLabel);
            JPasswordField senha = new JPasswordField(30);
            painel.add(senha);
            JButton cancelar = new JButton("cancelar");
            painel.add (cancelar);
            cancelar.addActionListener(a -> {
                login.setText("");
                senha.setText("");
            });
            JButton ok = new JButton("ok");
            ok.addActionListener(acao -> {
                if (login.getText().equals("root") && senha.getText().equals("51")){

                }
                else JOptionPane.showMessageDialog(null,"login ou senha incorretos");
            });
            painel.add (ok);
            this.setFont(font);
            this.setVisible(true);
        }
        

        JLabel criarLoginLabel(){
            JLabel loginLabel = new JLabel("Login");
            loginLabel.setFont(font);
            return loginLabel;
            }

        public GerenciadorAlunos(){
            super("Login");
        }



       
    
    
}
