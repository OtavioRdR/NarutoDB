package com.otavio.narutodb.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NinjaDeTaijutsuTest {

    @Test
    public void testUsarJutsu() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100);
        // Aqui você pode verificar se o método usarJutsu funciona corretamente.
        // Para isso, você pode refatorar o método para retornar uma String em vez de imprimir.
    }

    @Test
    public void testAdicionarJutsu() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100);
        ninja.adicionarJutsu("Rasengan");
        // Verifica se o jutsu foi adicionado
        assertTrue(ninja.getJutsus().contains("Rasengan"));
    }

    @Test
    public void testAumentarChakra() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100);
        ninja.adicaoAoChakra(20);
        // Verifica se o chakra foi aumentado corretamente
        assertEquals(120, ninja.getChakra());
    }
}