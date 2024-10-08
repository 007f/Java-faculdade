package org.example;

public class Pedido {
    private int id;
    private String textoPedido;
    private StatusPedido status; // enum

    public Pedido(int id, String textoPedido) {
        this.id = id;
        this.textoPedido = textoPedido;
        this.status = StatusPedido.NOVO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextoPedido() {
        return textoPedido;
    }

    public void setTextoPedido(String textoPedido) {
        this.textoPedido = textoPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", textoPedido='" + textoPedido + '\'' +
                ", status=" + status +
                '}';
    }
}
