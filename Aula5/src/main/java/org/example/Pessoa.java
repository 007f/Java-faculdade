package org.example;

public class Pessoa {

    private String nome;
    private int registro;

    public Pessoa(String nome, int registro) {
        this.nome = nome;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }
}
