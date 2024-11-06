package org.example;

import java.util.Scanner;

public class Controler {
    GeradorDeSenhas gerador = new GeradorDeSenhas();
    Validador validador = new Validador();

    public void cadastrar_conta(GerenciadorSenha lista){
        String Login;
        String Senha;
        int esc;
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

        Senha = validador.criptografar(Senha);

        lista.cadastrarsenha(Login, Senha);
    }




    private void exibir(GerenciadorSenha lista,  String nome, String senha){

        if(!validador.validar(lista, nome, senha)){// Exibir as senhas criptografadas
            System.out.println("Login ou senha Incorretos:");

            for (int x = 0; x < lista.getLista_senhas().size(); x++) {
                System.out.println("Conta: "+ lista.getLista_login().get(x) + " Senha: "+ lista.getLista_senhas().get(x));
            }
        }else {
            System.out.println("Senhas Descriptografadas:");
            for (int x = 0; x < lista.getLista_senhas().size(); x++) {
                System.out.println("Conta: "+ lista.getLista_login().get(x) + " Senha: "+ validador.descriptografar(lista.getLista_senhas().get(x)));
            }
        }



        // Descriptografar e exibir as senhas

    }

    public void acessar_lista(GerenciadorSenha lista, String login, String senha){
        exibir(lista, login, senha);
    }
}
