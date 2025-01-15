package com.otavio.narutodb.model;

public class NinjaDeNinjutsu extends Personagem implements Ninja {


    public NinjaDeNinjutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public void ultilizarJutsu() {
        System.out.println(getNome() + " Ultilizando golpe de Ninjutsu!!!!!");

    }

    @Override
    public void desviar() {
        System.out.println(getNome() + " Desviando de Ataque no estilo Genjutsu");

    }
}
