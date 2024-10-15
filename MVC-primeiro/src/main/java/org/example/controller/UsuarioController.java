package org.example.controller;

import org.example.model.Usuario;
import org.example.view.UsuarioView;

import java.util.ArrayList;
import java.util.List;

public class UsuarioController {
    List<Usuario> usuarios = new ArrayList<>();
    UsuarioView usuarioView = new UsuarioView();

    public void addUsuario(int id, String nome, int idade, String endereco) {
        Usuario usuario = new Usuario(id, nome, idade, endereco);
        usuarios.add(usuario);
        System.out.println("Usuario criado com sucesso.");

    }
    public void listarUsuarios(){
        usuarioView.imprimirTudo(usuarios);
    }
}