import java.util.Scanner;
public class StringComprimentoExerc4 {
    public static void main(String[] args) {
        System.out.println("Digite duas palavaras: ");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String[] palavras = texto.split(" ");
        System.out.println("coprimento primeira palavra: " + palavras[0].length());
        System.out.println("coprimento primeira palavra: " + palavras[1].length()); 
        sc.close();
    }
}
