package entities;


import java.time.LocalDate;

public class Parcelas {
    private LocalDate date;
    private double amount;

    private Parcelas(){
    }

    public Parcelas(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Parcela: valor = " + amount + ", vencimento = " + date;
    }
}
