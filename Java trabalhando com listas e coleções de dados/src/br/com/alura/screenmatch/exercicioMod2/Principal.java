package br.com.alura.screenmatch.exercicioMod2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 15.99, 5);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);

        System.out.println("O tamanho da lista é: "+listaDeProdutos.size());
        System.out.println("Produto na posição 0 é o: " + listaDeProdutos.getFirst().getNome());

        for (Produto produto : listaDeProdutos){
            System.out.println(produto);
        }
        ProdutoPerecivel produto3 = new ProdutoPerecivel("Abacaxi", 12, 12, "12/12/2025");
        System.out.println(produto3);
    }
}
