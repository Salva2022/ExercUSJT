import java.util.Scanner;

public class Fabrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalSalarios = 0;
        int totalPecas = 0;
        int totalH = 0;
        int totalM = 0;
        int pecasH = 0;
        int pecasM = 0;
        double maiorSalario = 0;
        int numeroMaior = 0;

        for (int i = 0; i <15; i++){
            System.out.println("Numero do funcionario:");
            int numero = sc.nextInt();
            System.out.println("Sexo do funcionario: ");
            String sexo = sc.next();
            System.out.println("Quantidade de peças: ");
            int pecas = sc.nextInt();
            double salario = 1320;
            double salarioporcen = salario;
            if (pecas > 20){
                salarioporcen = salario * 0.03 * (pecas - 20);
            }
            if (pecas > 30) {
                salarioporcen += salario * 0.02 * (pecas - 30);
            }
            System.out.println( "Nº " + numero  + " seu salario é de R$: " + String.format("%.2f", salarioporcen)   + ".");
            if (salarioporcen > maiorSalario){
                maiorSalario = salarioporcen;
                numeroMaior = numero;
            }
            totalSalarios += salarioporcen;
            totalPecas += pecas;
            if (sexo.equals("H")){
                totalH++;
                pecasH += pecas;
            } else {
                totalM++;
                pecasM += pecas;
            }

        }
        System.out.println("O valor total dos salários é de R$: " + String.format("%.2f", totalSalarios) + ".");
        System.out.println("O valor total de peças produzidas é de: " + totalPecas + " peças.");
        System.out.println("Média de peças por homens: " + (pecasH / totalH) + ".");
        System.out.println("Média de peças por mulheres: " + (pecasM / totalM) + ".");
        sc.close();
    }
    
}
