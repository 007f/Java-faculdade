package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GerenciadorSenha felipe = new GerenciadorSenha("felipe", "adm");
        Controler controler = new Controler();
        Scanner scanner = new Scanner(System.in);
        controler.cadastrar_conta(felipe);

        controler.cadastrar_conta(felipe);

        controler.cadastrar_conta(felipe);

        System.out.println("\nacessando lista");
        String Login;
        String Senha;
        for (int x = 0; x < 2; x++){
            System.out.println("\n");
            System.out.println("Digite o Login: ");
            Login = scanner.next();
            System.out.println("Digite o senha: ");
            Senha = scanner.next();

            controler.acessar_lista(felipe, Login, Senha);
        }

    }
}
