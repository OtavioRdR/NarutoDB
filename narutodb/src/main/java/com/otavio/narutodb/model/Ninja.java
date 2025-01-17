package com.otavio.narutodb.model;

public interface Ninja {
    void usarJutsu(String nomeJutsu, Personagem inimigo);
    void esquivar(int hit);
}