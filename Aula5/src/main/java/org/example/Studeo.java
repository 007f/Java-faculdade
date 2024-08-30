package org.example;

public class Studeo {

    public static void main(String[] args) {

        Professor joao = new Professor("Joao", 123);
        Aluno karen = new Aluno("Karen", 123);

        // Professor novo = new Aluno("Karen", 123); --> Erro de tipagem!

        boolean oi = true;
        Pessoa generico;
        if (oi) {
            generico = new Professor("Professor Generico", 123);
        } else {
            generico = new Aluno("Aluno Generico", 123);
        }
        Pessoa gabi = new Professor("Gabi", 1231); // Classe genérica recebe classe herdada!
        Pessoa henrique = new Aluno("Henrique", 123); // `Pessoa` (pai) pode receber `Professor` e `Aluno` (filhos)
        Pessoa moreno;
        Pessoa antonio;
    }
}
