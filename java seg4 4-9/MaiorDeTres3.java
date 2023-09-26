import java.util.Scanner;

public class MaiorDeTres3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    double a =  sc.nextDouble();
    System.out.println("Digite o segundo valor: ");
    double b = sc.nextDouble();
    System.out.println("Digite o terceiro valor: ");
    double c = sc.nextDouble();
    // A interrogação serve para criar uma condição  onde os valores que vem após ela3
    // são correspondentes a condição Verdadeira (a) e após os dois pontos, a condição falsa (b);
    double maiorIntermediario = a > b ? a : b;
    double maior = maiorIntermediario > c ? maiorIntermediario : c; 
    System.out.print(maior);
    sc.close();
    
}
}