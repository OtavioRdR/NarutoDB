package com.otavio.narutodb.model.mockito;

import com.otavio.narutodb.model.NinjaDeGenjutsu;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NinjaDeTaijutsuMockitoTest {

    @Test
    public void testUsarJutsu() {
        NinjaDeGenjutsu ninjaAtacante = new NinjaDeGenjutsu("Rock Lee", 13, "Konoha", 90, 60);
        NinjaDeGenjutsu ninjaDefensor = mock(NinjaDeGenjutsu.class);

        ninjaAtacante.adicionarJutsu("Taijutsu", 50, 20);
        ninjaAtacante.usarJutsu("Taijutsu", ninjaDefensor);

        verify(ninjaDefensor).perderVida(50);
    }

    @Test
    public void testEsquivar(){
        NinjaDeGenjutsu ninja = new NinjaDeGenjutsu("Rock Lee", 13, "Konoha", 90, 100);
        int hit = 40;
        ninja.esquivar(hit);
    }
}
