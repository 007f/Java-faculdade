package org.example;

public class SistemaPagamento {
    public static void main(String[] args) {
        Pagamento pgPix = new Pix();
        //pgPix.processarPagamento(100.00);

        Pagamento pgCartao = new CartaoCredito();
        //pgCartao.processarPagamento(130);
        Pagamento bitcoin = new Bitcoin();

        processarPg(pgPix, 100);
        processarPg(pgCartao, 130);
        processarPg(bitcoin, 1);
    }

    public static void processarPg(Pagamento pg, double valor) {
        pg.processarPagamento(valor);
    }
}
