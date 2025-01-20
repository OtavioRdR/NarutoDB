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

        NinjaDeGenjutsu itachi = new NinjaDeGenjutsu("Itachi Uchiha", 17, "Konoha", 100, 100);
        NinjaDeTaijutsu rockLee = new NinjaDeTaijutsu("Rock Lee", 13, "Konoha", 90, 100);
        NinjaDeNinjutsu sakura = new NinjaDeNinjutsu("Sakura Haruno", 12, "Konoha", 100, 100);

        itachi.adicionarJutsu("Mangekyō", 30, 10);
        rockLee.adicionarJutsu("Taijutsu", 20, 5);
        sakura.adicionarJutsu("Genjutsu", 25, 8);

        StringBuilder resultado = new StringBuilder();
        resultado.append("Interações com os ninjas:\n");

        itachi.usarJutsu("Mangekyō", rockLee);
        rockLee.esquivar(30);
        resultado.append("\n");

        rockLee.usarJutsu("Taijutsu", sakura);
        sakura.esquivar(20);
        resultado.append("\n");

        sakura.usarJutsu("Genjutsu", itachi);
        itachi.esquivar(25);
        resultado.append("\n");

        itachi.exibirInformacoes();
        rockLee.exibirInformacoes();
        sakura.exibirInformacoes();

        return resultado.toString();
    }
}