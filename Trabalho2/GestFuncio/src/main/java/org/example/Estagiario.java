package org.example;

public class Estagiario extends Funcionario{
    private String InstituicaoEnsino;
    private Double BolsaAuxilio;

    public Estagiario(String nome, String CPF, String instituicaoEnsino, double salarioBase) {
        super(nome, CPF, salarioBase);
        InstituicaoEnsino = instituicaoEnsino;
        BolsaAuxilio = salarioBase;
    }

    public String getInstituicaoEnsino() {
        return InstituicaoEnsino;
    }

    public double getBolsaAuxilio() {
        return BolsaAuxilio;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        InstituicaoEnsino = instituicaoEnsino;
    }

    public void setBolsaAuxilio(Double bolsaAuxilio) {
        BolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return getBolsaAuxilio();
    }

    public void exibirInformacoes() {
        System.out.println("Estagiario");
    }
}
