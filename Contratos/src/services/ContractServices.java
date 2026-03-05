package services;

import entities.Contrato;
import entities.Parcelas;

import java.time.LocalDate;

public class ContractServices {

    private OnlinePaymentService onlinePaymentService;

    public ContractServices(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contrato contract, int month){
        double basicQuota = contract.getTotalValue() / month;
        for (int i = 1; i <= month; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interestFee(basicQuota, i);
            double fee = onlinePaymentService.paymentfee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getParcelas().add(new Parcelas(dueDate, quota));
        }
    }
}
