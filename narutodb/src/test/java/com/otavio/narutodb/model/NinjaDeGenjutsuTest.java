package com.otavio.narutodb.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class NinjaDeGenjutsuTest {

    @Test
    public void testUsarJutsu() {
        NinjaDeGenjutsu ninjaAtacante = new NinjaDeGenjutsu("Itachi", 21, "Konoha", 100, 100);

        NinjaDeGenjutsu ninjaDefensor = mock(NinjaDeGenjutsu.class);

        ninjaAtacante.adicionarJutsu("Tsukuyomi", 50, 20);

        ninjaAtacante.usarJutsu("Tsukuyomi", ninjaDefensor);

        verify(ninjaDefensor).perderVida(50);

        assertEquals(80, ninjaAtacante.getChakra());
    }

    @Test
    public void testEsquivar() {
        NinjaDeGenjutsu ninja = new NinjaDeGenjutsu("Itachi", 21, "Konoha", 100, 100);

        int dano = 30;

        ninja.esquivar(dano);


    }
}