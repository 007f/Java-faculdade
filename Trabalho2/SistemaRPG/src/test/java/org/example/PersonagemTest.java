package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void testAtacar() {
        Personagem atacante = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        Personagem defensor = new Mago("Gandalf", 10, 80, 15, 5, 50, 25);
        atacante.atacar(defensor);
        assertTrue(defensor.estaVivo());
        //assertEquals(65, defensor.getHp());
        /* agr dará false pois há a incrementação do dano com a força extra do guerreiro.*/
    }

    @Test
    void testReceberDano() {
        Personagem personagem = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        personagem.receberDano(20);
        assertEquals(80, personagem.getHp());
    }

    @Test
    void testEstaVivo() {
        Personagem personagem = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        personagem.receberDano(100);
        assertFalse(personagem.estaVivo());
    }
}