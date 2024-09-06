package org.example;

public class CartaoCredito implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento efetuado no cartao no valor de R$ " + valor);
    }
}
