package com.otavio.narutodb.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NinjaDeTaijutsuTest {

    @Test
    public void testUsarJutsu() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100);
    }

    @Test
    public void testAdicionarJutsu() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100);
        ninja.adicionarJutsu("Rasengan");
        assertTrue(ninja.getJutsus().contains("Rasengan"));
    }

    @Test
    public void testAumentarChakra() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100);
        ninja.adicaoAoChakra(20);
        assertEquals(120, ninja.getChakra());
    }
}