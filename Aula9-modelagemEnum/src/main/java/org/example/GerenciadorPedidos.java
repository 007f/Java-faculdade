package org.example;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPedidos {
    List<Pedido> pedidos;

    public GerenciadorPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void criarPedido(int id, String textoPedido) {
        Pedido p = new Pedido(id, textoPedido);
        pedidos.add(p);
        System.out.println("Pedido Criado.");
    }

    public void atualizarStatus(int id, StatusPedido st){
        for (Pedido p : pedidos){
            if (p.getId() == id) {
                p.setStatus(st);
                System.out.println("Pedido alterado." + p.toString());
                return;
            }
        }
        System.out.println("Pedido não foi encontrado");
    }

    public void listarPedidosPorStatus(StatusPedido st) { // Equivalente ao 'SELECT' do SQL
        System.out.println("Pedidos com status " + st.getDescricao() + " :");
        for (Pedido p : pedidos) {
            if (p.getStatus() == st) {
                System.out.println(p);
            }
        }
    }
}

