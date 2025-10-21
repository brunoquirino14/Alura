package br.com.alura.screenmatch.exerciciosMod1Mod2;

public class Carro {
    String modelo;
    int ano;
    String cor;
    int ANO_ATUAL = 2025;


    void exibeFicha(){
        System.out.println("Ficha técnica: ");
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(cor);
    }

    void calculaIdade(){
        System.out.println("Idade do carro: "+ (ANO_ATUAL-ano));
    }
}
