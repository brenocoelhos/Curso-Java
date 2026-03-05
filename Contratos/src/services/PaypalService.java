package services;

public class PaypalService  implements OnlinePaymentService{
    public double paymentfee(double amount){
        return amount +(amount * 0.02);
    }

    public double interestFee(double amount, int months){
        return amount +(amount * (0.01 * months));
    }
}
