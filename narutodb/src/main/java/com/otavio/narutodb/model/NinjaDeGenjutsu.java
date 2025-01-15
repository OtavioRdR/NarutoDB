package com.otavio.narutodb.model;

public class NinjaDeGenjutsu extends Personagem implements Ninja{

    public NinjaDeGenjutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public void ultilizarJutsu() {
        System.out.println(getNome() + " Ultilizando golpe de Genjustsu!!!!!");

    }

    @Override
    public void desviar() {
        System.out.println(getNome() + " Desviando de Ataque no estilo GenJutsu");

    }
}
