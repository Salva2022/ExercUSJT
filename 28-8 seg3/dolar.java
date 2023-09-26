import java.util.Scanner;

public class dolar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a cotação do Dólar: ");
        double cotacao = scanner.nextDouble();
        System.out.println("Digite a quantidade de doláres: ");
        double quantidade = scanner.nextDouble();
        double  real = cotacao * quantidade;
        System.out.println("Quantidade em dólar: " +
        quantidade + "; em Real " + real);
        scanner.close();

    }
}