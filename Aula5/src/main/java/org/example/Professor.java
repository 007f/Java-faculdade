package org.example;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

    List<Aluno> alunos;

    public Professor(String nome, int registro) {
        super(nome, registro);
        this.alunos = new ArrayList<>();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
