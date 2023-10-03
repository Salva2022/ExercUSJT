import javax.swing.JFrame;
import javax.swing.JTextField;

public class CrudAluno {
    JTextField matricula = new JTextField(30);
    JTextField nome = new JTextField(30);
    JTextField email = new JTextField(30);

    public static void main(String[] args) {
        CrudAluno ca = new CrudAluno();
        ca.desenhar();
    }
    private void desenhar(){
        this.setSize(940,240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        JPanel painel = new JPanel (new BorderLayout());
        j
         
    }

    public CrudAluno(){
        
    }
}
