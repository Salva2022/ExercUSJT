import javax.swing.JOptionPane;

public class Repetição1 {
    public static void main(String[] args) {
        double nota1 , nota2;
        //int contador = 1;
        //while(contador<=5){
        //for(int contador = 1;  contador <= 5; contador ++);{
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
            JOptionPane.showMessageDialog(null, "Média:" + (nota1 + nota2 / 2));
            //contador ++;
        }
        }
    
    

