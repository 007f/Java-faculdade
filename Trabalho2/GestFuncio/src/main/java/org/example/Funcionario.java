package org.example;

public abstract class Funcionario {
    private String nome;
    private String Cpf;
    private double salarioBase;

    public Funcionario(String nome, String CPF, double salarioBase) {
        this.nome = nome;
        this.Cpf = CPF;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String CPF) {
        this.Cpf = CPF;
    }

    public void setSalarioBase(double salarioAtual) {
        this.salarioBase = salarioAtual;
    }

    public abstract double calcularSalario();
}
