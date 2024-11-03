package org.example;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorSenha extends Pessoa{

    private List<String> Lista_login = new ArrayList<>();
    private List<String> Lista_senhas = new ArrayList<>();;

    public GerenciadorSenha(String nome, String senha) {
        super(nome, senha);
    }

    public List<String> getLista_login() {
        return Lista_login;
    }

    private void setLista_login(String login) {
        this.Lista_login.add(login);
    }

    public List<String> getLista_senhas() {
        return Lista_senhas;
    }

    private void setLista_senhas(String senha) {
        this.Lista_senhas.add(senha);
    }

    public void cadastrarsenha(String login, String senha){
        this.setLista_login(login);
        this.setLista_senhas(senha);
    }
}
