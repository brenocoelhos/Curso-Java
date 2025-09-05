import java.util.Locale;
import java.util.Scanner;

import Entities.Funcionario;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Digite seu nome: ");
        funcionario.nome = sc.nextLine();

        System.out.println("Digite seu Salario Bruto: ");
        funcionario.grossSalary = sc.nextDouble();

        System.out.println("Digite o Imposto: ");
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: "+ funcionario.nome+ " Salario: $"+ funcionario.NetSalary());

        System.out.println("Qual a porcentagem vc quer Inserir no seu salario?");
        double percentage = sc.nextDouble();
        funcionario.IncreaseSalary(percentage);

        System.out.println("DADOS ATUALIZADOS!");
        System.out.println("Employee: "+ funcionario.nome+ " Salario: $"+ funcionario.NetSalary());
        sc.close();
    }
}