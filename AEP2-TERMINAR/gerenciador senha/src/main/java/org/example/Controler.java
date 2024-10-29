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
            System.out.println("Deseja gerar uma senha aleatoria?\n1) SIM\n2)NÃO\n");
            esc = scanner.nextInt();
        }while (esc != 1 && esc != 2);

        if (esc == 1){
            Senha = gerador.gerarSenha(7, true, true, true, true);
        }else {
            System.out.println("Digite a Senha: ");
            Senha = scanner.next();
        }

        lista.cadastrarsenha(Login, Senha);
    }
}
