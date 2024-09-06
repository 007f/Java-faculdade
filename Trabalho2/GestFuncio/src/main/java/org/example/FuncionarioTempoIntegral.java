package org.example;

public class FuncionarioTempoIntegral extends Funcionario {
    private double bonus;

    public FuncionarioTempoIntegral(String nome, String CPF, double salarioBase, double bonus) {
        super(nome, CPF, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void exibirInformacoes() {
        System.out.println("Funcionario de tempo integral");
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1+(getBonus()/100));
    }
}
