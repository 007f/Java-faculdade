package org.example;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    List<Professor> professores;

    public Aluno(String nome, int registro) {
        super(nome, registro);
        this.professores = new ArrayList<>();
    }

    public List<Professor> getProfessores() {
        return professores;
    }
}