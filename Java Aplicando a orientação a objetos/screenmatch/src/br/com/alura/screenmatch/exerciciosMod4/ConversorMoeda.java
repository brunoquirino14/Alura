package br.com.alura.screenmatch.exerciciosMod4;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public void converterDolarParaReal(double valor) {
        System.out.printf("O valor convertido é: R$ %.2f%n", valor*5);
    }
}
