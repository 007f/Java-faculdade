package org.example;

public class FuncionarioMeioPeriodo extends Funcionario {
    private double HorasTrabalhadas;
    private double ValorAHora;

    public FuncionarioMeioPeriodo(String nome, String CPF, double salarioBase, double horasTrabalhadas) {
        super(nome, CPF, salarioBase);
        HorasTrabalhadas = horasTrabalhadas;
        this.ValorAHora = salarioBase;
    }

    public double getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public double getValorAHora() {
        return ValorAHora;
    }

    @Override
    public double calcularSalario() {
        return getHorasTrabalhadas() * getValorAHora();
    }

    public void exibirInformacoes() {
        System.out.println("Funcionario de Meio Periodo");
    }
}
