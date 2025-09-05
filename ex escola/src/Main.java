import java.util.Locale;
import java.util.Scanner;

import utilities.aluno;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        aluno aluno = new aluno();

        System.out.printf("Insira seu nome:");
        aluno.nome = sc.nextLine();

        System.out.printf("Insira sua nota do 1B:");
        aluno.nota[0] = sc.nextFloat();
        System.out.printf("Insira sua nota do 2B:");
        aluno.nota[1] = sc.nextFloat();
        System.out.printf("Insira sua nota do 3B:");
        aluno.nota[2] = sc.nextFloat();

         float aux = aluno.resultado();

        System.out.printf("resultado: " + aux);

        sc.close();
    }
}