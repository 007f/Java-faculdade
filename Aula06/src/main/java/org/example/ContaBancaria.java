package org.example;

public abstract class ContaBancaria {
    private double saldo;
    private String NumeroConta;

    public ContaBancaria(double saldo, String numeroConta) {
        this.saldo = saldo;
        NumeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void sacar(double saque); // Método abstrato (força implementação nas classes herdeiras)

    public abstract void imprimirTipoConta(); // Método abstrato

}
