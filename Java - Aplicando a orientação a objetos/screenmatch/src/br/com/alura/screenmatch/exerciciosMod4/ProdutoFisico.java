package br.com.alura.screenmatch.exerciciosMod4;

public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(int valor) {
        double valorNovo = valor + (valor*0.2);
        return valorNovo;
    }
}
