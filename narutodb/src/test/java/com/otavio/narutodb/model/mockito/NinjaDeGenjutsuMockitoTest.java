package com.otavio.narutodb.model.mockito;

import com.otavio.narutodb.model.NinjaDeGenjutsu;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NinjaDeGenjutsuMockitoTest {

    @Test
    public void testUsarJutsu() {
        NinjaDeGenjutsu ninjaAtacante = new NinjaDeGenjutsu("Itachi", 21, "Konoha", 100, 100);
        NinjaDeGenjutsu ninjaDefensor = mock(NinjaDeGenjutsu.class); // Mockito - criação do mock

        ninjaAtacante.adicionarJutsu("Tsukuyomi", 50, 20);
        ninjaAtacante.usarJutsu("Tsukuyomi", ninjaDefensor);

        verify(ninjaDefensor).perderVida(50);
    }

    @Test
    public void testEsquivar(){
        NinjaDeGenjutsu ninja = new NinjaDeGenjutsu("Itachi Uchiha", 17, "Konoha", 100, 100);
        int hit = 40;
        ninja.esquivar(hit);
    }
}
