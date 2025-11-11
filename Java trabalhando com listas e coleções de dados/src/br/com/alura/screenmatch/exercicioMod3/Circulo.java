package br.com.alura.screenmatch.exercicioMod3;

public class Circulo implements Forma{

    int i;
    public Circulo(int i) {
        this.i = i;
    }

    @Override
    public double calcularArea(){
        return Math.PI*i*i;
    }
}
