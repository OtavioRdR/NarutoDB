package com.otavio.narutodb.model;

public class NinjaDeNinjutsu extends Personagem implements Ninja {
    public NinjaDeNinjutsu(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia);
    }

    @Override
    public void usarJutsu() {
        System.out.println(getNome() + " está usando um jutsu de Ninjutsu!");
    }

    @Override
    public void desviar() {
        System.out.println(getNome() + " está desviando de um ataque com sua habilidade em Ninjutsu.");
    }
}
