/*
10. Escreva um programa que oferece para o usuário as seguintes opções:
1 – Misto quente R$5,50
2 – Salada Chinesa R$10,20
3 – Suco de Laranja R$4,00
4 – Suco de Manga R$3,50

Se o usuário digitar qualquer número diferente de 1, 2, 3 ou 4, o seu programa deve exibir uma mensagem de erro e
terminar. Caso contrário, se o usuário escolher alguma bebida, o programa deve exibir “tenha um excelente drink, vai
lhe custar” seguido do valor da bebida. Se o usuário escolher alguma comida, o programa deve exibir “bom apetite,
vai lhe custar” seguido do valor da comida.
 */
import javax.swing.JOptionPane;

public class Exerc10CardapioJOptionPane {
    public static void main(String[] args) {
    
     int escolha = Integer.parseInt(JOptionPane.showInputDialog("Opções do cardápio: " + "\n1-Misto quente R$5,50." + 
     "\n2-Salada Chinesa R$10,20." +  "\n3-Suco de Laranja R$4,00." + "\n4-Suco de Manga R$3,50."));
    switch (escolha) {
        case 1:
        JOptionPane.showMessageDialog(null, "bom apetite, vai lhe custar " + "R$ 5,50.");
            break;
        case 2:
        JOptionPane.showMessageDialog(null, "bom apetite, vai lhe custar " + "R$ 10,20.");    
            break;
        case 3:
        JOptionPane.showMessageDialog(null, "tenha um excelente drink, vai lhe custar " + "R$ 4,00.");    
            break;
        case 4:
        JOptionPane.showMessageDialog(null, "tenha um excelente drink, vai lhe custar " + "R$ 3,50.");    
            break;
    
        default:
        System.out.println("Erro. Opção Inválida.");
    }
    }
}