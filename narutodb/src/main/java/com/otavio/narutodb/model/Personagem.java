package com.otavio.narutodb.model;

import java.util.HashMap;
import java.util.Map;

public class Personagem {
    private String nome;
    private int idade;
    private String aldeia;
    private Map<String, Jutsu> jutsus; // Mapeia o nome do jutsu para a instância de Jutsu
    private int chakra;
    private int vida;

    public Personagem(String nome, int idade, String aldeia, int chakra, int vida) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.chakra = chakra;
        this.vida = vida;
        this.jutsus = new HashMap<>();
    }

    public void adicionarJutsu(String nomeJutsu, int hit, int consumoChakra) {
        jutsus.put(nomeJutsu, new Jutsu(hit, consumoChakra));
    }

    public void adicaoAoChakra(int valor) {
        this.chakra += valor;
    }

    public void usarJutsu(String nomeJutsu, Personagem inimigo) {
        if (jutsus.containsKey(nomeJutsu)) {
            Jutsu jutsu = jutsus.get(nomeJutsu);
            if (chakra >= jutsu.getConsumirChakra()) {
                chakra -= jutsu.getConsumirChakra();
                inimigo.perderVida(jutsu.getHit());
                System.out.println(nome + " usou " + nomeJutsu + " causando " + jutsu.getHit() + " de hit!\uD83D\uDD2A\uD83E\uDE78");
            } else {
                System.out.println(nome + " não tem chakra suficiente para usar " + nomeJutsu);
            }
        } else {
            System.out.println(nome + " não conhece o jutsu " + nomeJutsu);
        }
    }

    public void esquivar(int hit) {
        boolean sucesso = Math.random() > 0.5;
        if ( sucesso) {
            System.out.println(nome + " desviou do ataque!");
        } else {
            perderVida(hit);
            System.out.println(nome + " não conseguiu desviar e perdeu " + hit + " de vida!❤\uFE0F\u200D\uD83E\uDE79");
        }
    }

    public void perderVida(int hit) {
        vida -= hit;
        if (vida < 0) vida = 0;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Jutsus: " + jutsus.keySet());
        System.out.println("Chakra: " + chakra);
        System.out.println("Vida: " + vida);
    }

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }

    public int getVida() {
        return vida;
    }

    public Map<String, Jutsu> getJutsus() {
        return jutsus;
    }
}