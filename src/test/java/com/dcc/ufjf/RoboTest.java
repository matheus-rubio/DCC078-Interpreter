package com.dcc.ufjf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoboTest {

    @Test
    void roboDeveReceberMultiplosComandos() {
        Robô robo = new Robô();
        assertEquals(
                "[O Robô andou pra cima, O Robô andou pra baixo, O Robô andou pra esquerda, O Robô andou pra direita]",
                robo.receberComandos("cima baixo esquerda direita"));
    }

    @Test
    void roboDeveReceberComandoParaCima() {
        Robô robo = new Robô();
        assertEquals("[O Robô andou pra cima]", robo.receberComandos("cima"));
    }

    @Test
    void roboDeveReceberComandoParaBaixo() {
        Robô robo = new Robô();
        assertEquals("[O Robô andou pra baixo]", robo.receberComandos("baixo"));
    }

    @Test
    void roboDeveReceberComandoParaEsquerda() {
        Robô robo = new Robô();
        assertEquals("[O Robô andou pra esquerda]", robo.receberComandos("esquerda"));
    }

    @Test
    void roboDeveReceberComandoParaDireita() {
        Robô robo = new Robô();
        assertEquals("[O Robô andou pra direita]", robo.receberComandos("direita"));
    }

    @Test
    void roboDeveReceberComandoInvalido() {
        try {
            Robô robo = new Robô();
            robo.receberComandos("diagonal");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Comando inválido", e.getMessage());
        }
    }
}
