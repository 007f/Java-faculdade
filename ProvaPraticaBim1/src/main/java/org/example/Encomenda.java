package org.example;

public class Encomenda {
    private String prioridade;
    private float volume;
    private float peso;
    private int prazo;

    private String veiculo;

    public Encomenda(String prioridade, float volume, float peso, int prazo) {
        this.prioridade = prioridade;
        this.volume = volume;
        this.peso = peso;
        this.prazo = prazo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public float getVolume() {
        return volume;
    }

    public float getPeso() {
        return peso;
    }

    public int getPrazo() {
        return prazo;
    }
}
