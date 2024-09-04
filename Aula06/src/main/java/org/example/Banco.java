package org.example;

public class Banco {

    public static void main(String[] args) {

        /*ContaCorrente inter = new ContaCorrente(100.00, "12313-9", 1000.00);

        System.out.println("Qual o número da conta? " + inter.getNumeroConta());
        inter.imprimirTipoConta();

        System.out.println("Qual o saldo atual? " + inter.getSaldo());
        System.out.println("Qual o Credito? " + inter.getCreditoSaque());
        inter.depositar(100.00);
        inter.sacar(1100.00);
        System.out.println("Qual o saldo atual? " + inter.getSaldo());*/

        ContaPoupanca nu = new ContaPoupanca(100.00, "33301-9", 0.05);

        System.out.println("Qual o número da conta? " + nu.getNumeroConta());
        nu.imprimirTipoConta();

        System.out.println("Qual o saldo atual? " + nu.getSaldo());
        nu.aplicacao();
        System.out.println("Qual o saldo atual? " + nu.getSaldo());
    }
}