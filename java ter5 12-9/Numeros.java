import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while (x != 0){
            x = sc.nextInt();
            System.out.println(x * x);
            
               }
               sc.close();
    }
}
