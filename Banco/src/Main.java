import java.util.Locale;
import java.util.Scanner;
import Utilities.Usuario;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        int conta;
        double saldo,depositar, sacar;
        char deposito;
        Usuario usuario;

        System.out.print("Digite sua conta: ");
        conta = sc.nextInt();

        sc.nextLine();
        System.out.print("Digite seu Nome: ");
        name = sc.nextLine();

        System.out.print("Deseja fazer um deposito? [Y]Sim [N]Nao");
        deposito = sc.next().charAt(0);

        if(deposito == 'y'){
            System.out.println("Digite seu saldo: ");
            saldo = sc.nextDouble();

            usuario = new Usuario(name, conta, saldo);

        }else{
            usuario = new Usuario(name, conta);

        }
        System.out.println("Dados da conta: ");
        System.out.println(usuario);

        System.out.println("deposite um saldo: ");
        depositar = sc.nextDouble();
        usuario.Deposito(depositar);

        System.out.println("Conta atualizada com sucesso!: ");
        System.out.println(usuario);
        System.out.println();

        System.out.println("Sacar saldo: ");
        sacar = sc.nextDouble();
        usuario.Saque(sacar);

        System.out.println("Conta atualizada com sucesso!: ");
        System.out.println(usuario);

        sc.close();
    }
}