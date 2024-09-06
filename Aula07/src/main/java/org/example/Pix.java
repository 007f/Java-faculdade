package org.example;

public class Pix implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Seu PIX foi enviado no valor de R$ " + valor);
    }
}
