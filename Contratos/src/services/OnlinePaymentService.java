package services;

public interface OnlinePaymentService {

     double paymentfee(double amount);

     double interestFee(double amount, int months);
}
