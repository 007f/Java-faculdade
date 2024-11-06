package org.example;

public class Validador {
    public String descriptografar(String senha) {
        StringBuilder senhadesCriptografada = new StringBuilder();
        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            int ascii = (int) caractere - 3;
            senhadesCriptografada.append((char) ascii);
        }
        return senhadesCriptografada.toString();
    }
    public String criptografar(String senha) {
        StringBuilder senhaCriptografada = new StringBuilder();
        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            int ascii = (int) caractere + 3; // Adiciona um deslocamento de 3 ao código ASCII
            senhaCriptografada.append((char) ascii); // Converte de volta para caractere e adiciona à string final
        }

        return senhaCriptografada.toString();
    }

    public boolean validar(GerenciadorSenha pessoa,String nome, String senha) {
        return pessoa.getNome().equals(nome) && pessoa.getSenha().equals(senha);
    }
}
