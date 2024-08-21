package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroTest {

    //dado de entrada
    Livro livro = new Livro("Casmurro", "Machado", "1899");
    @Test
    public void testGetTitulo(){
        assertEquals("Casmurro", livro.getTitulo());
    }

    @Test
    public void testGetAutor(){
        assertEquals("Machado", livro.getAutor());
    }
}
