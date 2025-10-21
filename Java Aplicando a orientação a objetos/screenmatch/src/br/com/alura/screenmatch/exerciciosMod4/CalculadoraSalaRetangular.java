package br.com.alura.screenmatch.exerciciosMod4;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(int valor1, int valor2) {
        System.out.println("A àrea desta sala é de " + valor1*valor2 + " metros quadrados.");
    }

    @Override
    public void calcularPerimetro(int valorLado1, int valorLado2) {
        System.out.println("O perímetro desta sala é de "+ (2*valorLado1+2*valorLado2)+ " metros.");
    }
}
