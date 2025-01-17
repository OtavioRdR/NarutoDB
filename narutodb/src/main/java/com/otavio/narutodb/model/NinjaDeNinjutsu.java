package com.otavio.narutodb.model;

public class NinjaDeNinjutsu extends Personagem implements Ninja {

    public NinjaDeNinjutsu(String nome, int idade, String aldeia, int chakra, int vida) {
        super(nome, idade, aldeia, chakra, vida);
    }

    @Override
    public void usarJutsu(String nomeJutsu, Personagem inimigo) {
        super.usarJutsu(nomeJutsu, inimigo);
    }

    @Override
    public void esquivar(int hit) {
        super.esquivar(hit);
    }
}