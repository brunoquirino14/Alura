package br.com.alura.screenmatch.exerciciosMod3;

public class Cachorro extends Animal{

    public void abanarRabo(){
        System.out.println("Estou abanando o rabo!");
    }

    @Override
    public void emitirSom(){
        System.out.println("Latindo como um cachorro!");
    }
}
