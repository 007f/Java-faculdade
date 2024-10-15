package org.example.view;

import org.example.controller.UsuarioController;
import org.example.model.Usuario;

import java.util.List;
import java.util.Scanner;

public class UsuarioView {

    Scanner sc = new Scanner(System.in);
    UsuarioController usuarioController = new UsuarioController();

    // output
    public void imprimirUsuario(Usuario usuario) {
        System.out.println("Id: " + usuario.getId());
        System.out.println("Nome: " + usuario.getNome());
    }

    // output
    public void imprimirTudo(List<Usuario> usuarios) {
        System.out.println("Todos os usuários no sistema: ");
        for (Usuario user : usuarios) System.out.println(user.toString());
    }

    // input
    public void cadastrarUsuario() {
        System.out.println("Digite um id: ");
        int id = sc.nextInt();
        System.out.println("Digite um nome: ");
        String nome = sc.next();
        System.out.println("Digite uma idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite um endereço: ");
        String endereco = sc.next();
        usuarioController.addUsuario(id, nome, idade, endereco);
    }
}