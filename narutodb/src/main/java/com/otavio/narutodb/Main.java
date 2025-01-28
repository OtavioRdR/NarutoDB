package com.otavio.narutodb;

import com.otavio.narutodb.model.NinjaDeGenjutsu;
import com.otavio.narutodb.model.NinjaDeNinjutsu;
import com.otavio.narutodb.model.NinjaDeTaijutsu;

public class Main {
    public static void main(String[] args) {
        NinjaDeTaijutsu ninjaTaijutsu = new NinjaDeTaijutsu("Rock Lee", 18, "Aldeia da Folha");
        NinjaDeNinjutsu ninjaNinjutsu = new NinjaDeNinjutsu("Naruto Uzumaki", 17, "Aldeia da Folha");
        NinjaDeGenjutsu ninjaGenjutsu = new NinjaDeGenjutsu("Itachi Uchiha", 21, "Aldeia da Folha");

        ninjaTaijutsu.adicionarJutsu("Poder do Taijutsu");
        ninjaNinjutsu.adicionarJutsu("Rasengan");
        ninjaGenjutsu.adicionarJutsu("Tsukuyomi");

        ninjaTaijutsu.exibirInformacoes();
        ninjaNinjutsu.exibirInformacoes();
        ninjaGenjutsu.exibirInformacoes();

        ninjaTaijutsu.usarJutsu();
        ninjaNinjutsu.desviar();
        ninjaGenjutsu.usarJutsu();
    }
}
