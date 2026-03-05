import entities.Contrato;
import entities.Parcelas; // <- singular
import services.PaypalService;
import services.ContractServices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contrato obj = new Contrato(number, date, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractServices service = new ContractServices(new PaypalService());

        service.processContract(obj, n);

        System.out.println("Parcelas:");
        for (Parcelas installment : obj.getParcelas()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
