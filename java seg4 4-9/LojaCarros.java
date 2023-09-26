import java.util.Scanner;

public class LojaCarros{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de carros vendidos pelo vendedor: ");
        int carrosVendidos = sc.nextInt();
        System.out.println("Digite o número de vendas");
        double vendas = sc.nextDouble();
        System.out.println("Digite o seu salário fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor recebido pelo carro vendido: ");
        double valorRecebido = sc.nextDouble();
        double pagamento = salarioFixo + (carrosVendidos * valorRecebido) + (vendas * 5/100);
        System.out.println("O valor do seu pagamento será de: " + pagamento);
        sc.close();
    }
}