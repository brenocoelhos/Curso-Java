package Entities;

public class Funcionario {
    public String nome;
    public double grossSalary;
    public double tax;


    //salario Líquido
    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        double aux= grossSalary * percentage/100;
        grossSalary += aux;
    }
}
