package entities;


import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Contrato {
    private int number;
    private LocalDate date;
    private double totalValue;

    private List<Parcelas> parcelas = new ArrayList<>();

    public Contrato() {}

    public Contrato(int number, LocalDate date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public double getTotalValue() {
        return totalValue;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }


}
