package com.otavio.narutodb.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NinjaDeTaijutsuTest {

    @Test
    public void testUsarJutsu() {
        NinjaDeTaijutsu ninja1 = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100, 100);
        NinjaDeTaijutsu ninja2 = mock(NinjaDeTaijutsu.class);

        ninja1.adicionarJutsu("Rasengan", 30, 10);
        ninja1.usarJutsu("Rasengan", ninja2);

        verify(ninja2).perderVida(30);
        assertEquals(90, ninja1.getChakra());
    }

    @Test
    public void testEsquivar() {
        NinjaDeTaijutsu ninja = new NinjaDeTaijutsu("Naruto", 17, "Konoha", 100, 100);
        ninja.esquivar(20);

    }
}