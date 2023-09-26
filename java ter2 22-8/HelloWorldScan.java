import java.util.Scanner;

public class HelloWorldScan {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro valor");
    int primeiroValor = sc.nextInt();
    System.out.println("Digite o primeiro valor");
    int segundoValor = sc.nextInt();
    int resultado = primeiroValor + segundoValor;
    System.out.println("A soma é " + resultado);
    sc.close();
    }
}