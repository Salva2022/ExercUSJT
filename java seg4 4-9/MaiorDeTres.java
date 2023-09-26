import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número A");
        double a = sc.nextDouble();
        System.out.println("Digite o número B");
        double b = sc.nextDouble();
        System.out.println("Digite o número C");
        double c = sc.nextDouble();
        if ((a > b)  && (a > c)) {
            System.out.println(a);
        } else if ((b > a) && (b > c)) {
            System.out.println(b);
        } 
            System.out.println("O maior número é " + c);
        sc.close();
        }
      
    }
