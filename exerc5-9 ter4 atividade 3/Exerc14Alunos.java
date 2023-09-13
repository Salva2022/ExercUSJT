/*
14. Escreva um programa que lê as notas de 10 alunos e calcula a média aritmética delas. Caso a média seja pelo
menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8. Caso contrário, o programa
deve exibir a quantidade de alunos que tiraram nota 0.
 */
import java.util.Scanner;
public class Exerc14Alunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaAcima8 = 0;
        int notaZero = 0;
        double somaNotas = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Insira a nota do " + i + "º aluno:");
            double nota = sc.nextDouble();
            somaNotas += nota;
            if (nota > 8) {
                notaAcima8++;
            } else if (nota == 0) {
                notaZero++;
            }
        }
        double media = somaNotas / 10;
        System.out.println("Média das notas: " + media);

        if (media >= 6) {
            System.out.println("Alunos que possuem nota maior que 8: " + notaAcima8);
        } else {
            System.out.println("Alunos que possuem nota zero: " + notaZero);
        }
        sc.close();
    }
}


