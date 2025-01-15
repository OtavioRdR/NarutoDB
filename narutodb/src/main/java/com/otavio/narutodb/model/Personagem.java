package com.otavio.narutodb.model;

import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int idade;
    private String aldeia;
    private List<String> jutsus;
    private int chakra;

    public Personagem(String nome, int idade, String aldeia, int chakra ){
        this.nome = nome;
        this.aldeia = aldeia;
        this.chakra = chakra;
        this.jutsus = new ArrayList<>();
        this.idade = idade;
    }

    public void adicionarJutsu(String jutsu){
        jutsus.add(jutsu);
    }

     public void adicaoAoChakra(int valor){
        this.chakra += valor;
     }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Jutsus: " + jutsus);
        System.out.println("Chakra: " + chakra);
    }

    public String getNome() {
        return nome;
    }
    public int getChakra() {
        return chakra;
    }

    public List<String> getJutsus() {
        return jutsus;
    }
}
