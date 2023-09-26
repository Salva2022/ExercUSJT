import java.util.Scanner;

public class MaiorDeTres2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro valor: ");
    double a =  sc.nextDouble();
    System.out.println("Digite o segundo valor: ");
    double b = sc.nextDouble();
    System.out.println("Digite o terceiro valor: ");
    double c = sc.nextDouble();
    if (a > b){
        if (a > c){
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    } else {
        if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
    sc.close();
    }
   


}

