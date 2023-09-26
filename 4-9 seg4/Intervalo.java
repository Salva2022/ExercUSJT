import java.util.Scanner;

public class Intervalo{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor no intervalo de 1 a 7");
    int valor = sc.nextInt();
    if (valor == 1){
    System.out.println("Domingo");
    } else if(valor == 2){
    System.out.println("Segunda");
    } else if(valor == 3){
    System.out.println("Terça");
    } else if(valor == 4){
    System.out.println("Quarta");
    } else if(valor == 5){
    System.out.println("Quinta");
    } else if(valor == 6){
    System.out.println("Sexta");
    } else if(valor == 7){
    System.out.println("Sábado");
    } else {
    System.out.println("Valor incorreto");    
    }
    sc.close();
    }
  
}


