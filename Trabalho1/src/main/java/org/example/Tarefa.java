package org.example;

public class Tarefa {
    private String nome;
    private String prazo;
    private boolean conclida;

    public Tarefa(String nome, String prazo) {
        this.nome = nome;
        this.prazo = prazo;
        this.conclida = false;
    }

    public String getNome() {
        return nome;
    }

    public String getPrazo() {
        return prazo;
    }

    public boolean isConcluida() {
        return conclida;
    }

    public void concluirTarefa(){
        this.conclida = true;
    }

    public void alterarPrazo(String novoPrazo){
        this.prazo = novoPrazo;
    }
}
