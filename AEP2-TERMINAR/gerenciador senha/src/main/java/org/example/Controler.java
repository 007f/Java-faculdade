package org.example;

import java.util.Scanner;

public class Controler {
    GeradorDeSenhas gerador = new GeradorDeSenhas();

    public void cadastrar_conta(GerenciadorSenha lista){
        String Login;
        String Senha;
        int esc = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Login: ");
        Login = scanner.next();

        do{
            System.out.println("Deseja gerar uma senha aleatoria?\n1)SIM\n2)NÃO\n");
            esc = (int)scanner.nextInt();
        }while (esc != 1 && esc != 2);

        if (esc == 1){
            Senha = gerador.gerarSenha(7, true, true, true, true);
        }else {
            System.out.println("Digite a Senha: ");
            Senha = scanner.next();
        }

        Senha = this.criptografar(Senha);

        lista.cadastrarsenha(Login, Senha);
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

    public String descriptografar(String senha) {
        StringBuilder senhadesCriptografada = new StringBuilder();
        for (int i = 0; i < senha.length(); i++) {
            char caractere = senha.charAt(i);
            int ascii = (int) caractere - 3;
            senhadesCriptografada.append((char) ascii);
        }
        return senhadesCriptografada.toString();
    }

    private void exibir(GerenciadorSenha lista){
        // Exibir as senhas criptografadas
        System.out.println("Senhas Criptografadas:");
        for (String senha : lista.getLista_senhas()) {
            System.out.println(senha);
        }

        // Descriptografar e exibir as senhas
        System.out.println("\nSenhas Descriptografadas:");
        for (String senhaCriptografada : lista.getLista_senhas()) {
            System.out.println(this.descriptografar(senhaCriptografada));
        }
    }

    public void acessar_lista(GerenciadorSenha lista){
        exibir(lista);
    }
}
