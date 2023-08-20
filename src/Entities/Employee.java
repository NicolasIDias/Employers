package Entities;

public class Employee {

    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary(){
        return this.GrossSalary - this.Tax;
    }

    public void increaseSalary(double percentage){
        this.GrossSalary += this.GrossSalary * percentage / 100;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", NetSalary());
    }
}
