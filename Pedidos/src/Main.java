import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import entities.*;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente: ");
        Cliente cliente = new Cliente();
        System.out.println("nome do cliente: ");
        cliente.setNome(sc.next());
        System.out.println("email do cliente: ");
        cliente.setEmail(sc.next());
        System.out.println("data de aniversário do cliente: ");
        cliente.setData(LocalDate.parse(sc.next(),formatter));

        System.out.println("Status: "+ OrderStatus.PROCESSING);
        System.out.println("nome do produto: ");
        String nomeProduto = sc.next();
        System.out.println("valor do produto: ");
        double valor = sc.nextDouble();
        Product produto = new Product(nomeProduto, valor);

        System.out.println("\nResumo do pedido:");
        System.out.println("Cliente: " + cliente.getNome() + " - " + cliente.getEmail());
        System.out.println("Data de nascimento: " + cliente.getData().format(formatter));
        System.out.println("Produto: " + produto.getName());
        System.out.printf("Preço: R$ %.2f\n", produto.getPrice());
        System.out.println("Status: " + OrderStatus.PROCESSING);


        sc.close();

    }
}