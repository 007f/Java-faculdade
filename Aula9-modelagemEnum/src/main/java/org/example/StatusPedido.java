package org.example;

public enum StatusPedido {
    NOVO ("Novo pedido criado"),
    PRONTO ("O pedido está pronto"),
    PREPARANDO ("O pedido está em preparação"),
    ENTREGUE ("O pedido foi entregue");
    //acima temos valores que podem ser chamados e não poderão ser alterados ao longo da execução
    //valores podem carregar com sigo descrição
    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
