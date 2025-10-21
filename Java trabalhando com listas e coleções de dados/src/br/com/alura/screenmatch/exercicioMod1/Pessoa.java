package br.com.alura.screenmatch.exercicioMod1;

public class Pessoa {
    String nome;
    int idade = 0;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome da pessoa: " + this.nome + ", sua idade é: " + this.idade;
    }
}
