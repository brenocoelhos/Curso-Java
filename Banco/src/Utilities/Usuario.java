package Utilities;

public class Usuario {
    private String nome;
    private int conta;
    private double saldo;

    public Usuario() {}

    public Usuario(String nome, int conta, double saldo) {
        this.nome = nome;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Usuario(String nome, int conta) {
        this.nome = nome;
        this.conta = 0;
    }

    public String getName(){
        return nome;
    }

    public void setName(String nome){
        this.nome = nome;
    }

    public int getConta(){
        return conta;
    }

    public double saldo(){
        return saldo;
    }
    public String toString(){
        return "Nome: " + nome + ", Conta: " + conta + ", Saldo: R$" + saldo;
    }
    public void Deposito(double saldo){
        this.saldo += saldo ;
    }

    public void Saque(double saldo){
        this.saldo -= saldo + 5;
    }
}

