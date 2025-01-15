package com.otavio.narutodb.controller;

import com.otavio.narutodb.model.NinjaDeGenjutsu;
import com.otavio.narutodb.model.NinjaDeNinjutsu;
import com.otavio.narutodb.model.NinjaDeTaijutsu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NarutoController {

    @GetMapping("/ninja")
    public String interagirComNinjas() {

        NinjaDeGenjutsu itachi = new NinjaDeGenjutsu("Itachi Uchiha", 17, "Konoha", 100);
        NinjaDeTaijutsu rockLee = new NinjaDeTaijutsu("Rock Lee", 13, "Konoha", 90);
        NinjaDeNinjutsu sakura = new NinjaDeNinjutsu("Sakura Haruno", 12, "Konoha", 100);

        itachi.adicionarJutsu("Mangekyō");
        rockLee.adicionarJutsu("Taijutsu");
        sakura.adicionarJutsu("Genjutsu");

        itachi.adicaoAoChakra(30);
        rockLee.adicaoAoChakra(10);
        sakura.adicaoAoChakra(5);


        StringBuilder resultado = new StringBuilder();
        resultado.append("Interações com os ninjas:\n");
        itachi.exibirInformacoes();
        itachi.ultilizarJutsu();
        itachi.desviar();
        resultado.append("\n");

        rockLee.exibirInformacoes();
        rockLee.ultilizarJutsu();
        rockLee.desviar();
        resultado.append("\n");

        sakura.exibirInformacoes();
        sakura.ultilizarJutsu();
        sakura.desviar();

        return resultado.toString();
    }
}
