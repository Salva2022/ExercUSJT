import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        long n = sc.nextLong();
        if (n <= 3){ 
            System.out.println("é primo");
        } else {
            boolean ehPrimo = true;

            for (int div =2; div < (n-1); div++){
                if (n % div == 0){
                    System.out.println("consegui dividir por:" + div);
                    ehPrimo =false;
                    break;
                }
            }
        

            if(ehPrimo) {
                System.out.println("é primo");
            } else {
                System.out.println("não é primo");
            }
          
        }
          sc.close();
    
    }
}
