package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaBancariaTest {

    ContaBancaria cb = new ContaBancaria("Joao", 123, 0.0f);

    @Test
    public void testGetTitular(){
        assertEquals("Joao", cb.getTitular());
    }

    @Test
    public void testGetNumConta(){
        assertEquals(123, cb.getNumConta());
    }

    @Test
    public void testDepositar(){
        //se o de zero aumentar passou
        cb.depositar(1.2f);
        assertEquals(1.2f, cb.getSaldo());
    }

    @Test
    public void testSacar(){
        cb.depositar(1000.0f);
        cb.sacar(500.0f);
        assertEquals(500.0f, cb.getSaldo());
    }
}
