package org.example;

public class Bitcoin  implements Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Bitcoin pago " + valor);
    }
}
