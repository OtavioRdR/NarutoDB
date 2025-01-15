package com.otavio.narutodb.model;


public class NinjaDeTaijutsu extends Personagem implements Ninja {

    public NinjaDeTaijutsu(String nome, int idade, String aldeia, int chakra) {
        super(nome, idade, aldeia, chakra);
    }

    @Override
    public void ultilizarJutsu() {
        System.out.println(getNome() + " Ultilizando golpe de Taijutsu!!!!!");
    }

    @Override
    public void desviar() {
        System.out.println(getNome() + " Desviando de Ataque no estilo Taijutsu");
    }
}
