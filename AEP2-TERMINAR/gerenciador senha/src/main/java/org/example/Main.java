package org.example;

public class Main {
    public static void main(String[] args){
        GerenciadorSenha felipe = new GerenciadorSenha("felipe", "adm");
        Controler controler = new Controler();

        controler.cadastrar_conta(felipe);

        controler.cadastrar_conta(felipe);

        controler.cadastrar_conta(felipe);

        controler.acessar_lista(felipe);
    }
}
