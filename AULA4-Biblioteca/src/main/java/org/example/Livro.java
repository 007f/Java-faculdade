package org.example;

public class Livro {
    private String titulo;
    private String autor;
    private String anoPublicacao;
    private boolean disponibilidade;

    // OBS: É possível criar os construtores de forma automatizada, com `Generate` --> `Constructor`
    public Livro(String titulo, String autor, String anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true;
    }

    /* Essa automação também vale para os métodos de acesso e modificação da classe (os `getters` e os `setters`)
       utilizando `Generate` --> `Getters`. Também serve para os `setters`, com `Generate` --> `Setters`
       OBS: Também é possível Atalho: Alt + Insert */
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }
}