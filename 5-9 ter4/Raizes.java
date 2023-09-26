import java.util.Scanner;

public class Raizes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os três coeficeintes");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = b * b - (4 * a * c);
        if (delta < 0){
            System.out.println("Não tem raizes");
        } else if ( delta == 0){
            System.out.println("A raiz é");
            double raiz = -b /(2 * a);
            System.out.println(raiz);
        } else{
            System.out.println("Temos duas raizes");
            double raizMais = (-b + delta) / (2 * a);
            System.out.println("Primeira: " + raizMais);
            double raizMenos = (-b - delta) /(2 * a);
            System.out.println("Segunda: " + raizMenos);
            sc.close();


        }
        
    }
}