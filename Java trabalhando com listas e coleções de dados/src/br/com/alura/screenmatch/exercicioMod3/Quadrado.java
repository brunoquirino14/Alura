package br.com.alura.screenmatch.exercicioMod3;

public class Quadrado implements Forma{

    int i;
    public Quadrado(int i) {
        this.i = i;
    }

    @Override
    public double calcularArea(){
        return i*i;
    }
}
