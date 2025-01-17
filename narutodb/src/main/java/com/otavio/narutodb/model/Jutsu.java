package com.otavio.narutodb.model;

public class Jutsu {
    private int hit; //<<<<<<<troquei dano por hit so pra diferenciar
    private int consumoChakra;

    public Jutsu(int hit, int consumoChakra) {
        this.hit = hit;
        this.consumoChakra = consumoChakra;
    }

    public int getHit() {
        return hit;
    }

    public int getConsumirChakra() {
        return consumoChakra;
    }
}