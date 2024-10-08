package org.example;

public class Main {
    public static void main(String[] args) {

        GerenciadorPedidos gerenciador = new GerenciadorPedidos();

        for (int i = 0; i < 30; i++) gerenciador.criarPedido(i, "Um duplo sem salsicha.");

        for (int i = 0; i < 30; i+=2) gerenciador.atualizarStatus(i, StatusPedido.PREPARANDO);

        gerenciador.listarPedidosPorStatus(StatusPedido.NOVO);
        sgerenciador.listarPedidosPorStatus(StatusPedido.PREPARANDO);
        }

    }
}