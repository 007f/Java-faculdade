package org.example;

public class ContaBancaria {
    private String titular;
    private int numConta;
    private float saldo;

    public ContaBancaria(String titular, int numConta, float saldo){
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor){
        if(valor > 0){
            saldo=saldo+valor;
            System.out.println("Deposito efetuado. Saldo atual R$ "+saldo);
        }else{
            System.out.println("Valor de deposito incorreto.");
        }
    }

    public void sacar(float valor){
        if(valor > 0 && valor <=saldo){
            saldo=saldo-valor;
            System.out.println("Saque realizado. Saldo atual R$ "+saldo);
        }else{
            System.out.println("saldo insuficiente.");
        }
    }
}
