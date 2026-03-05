package entities;

import javax.security.auth.login.AccountException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {}

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void withdraw(double amount) throws DomainExceptions {
        if(withdrawLimit < amount){
            throw new DomainExceptions("Withdraw limit must be greater than or equal to amount");
        }if(this.balance < amount){
            throw new DomainExceptions("Error: the value is not enough");
        }
        this.balance -= amount;

    }
    public void deposit(double amount) {
        balance += amount;
    }

}
