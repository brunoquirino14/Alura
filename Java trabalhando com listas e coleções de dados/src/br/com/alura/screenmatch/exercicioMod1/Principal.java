package br.com.alura.screenmatch.exercicioMod1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Bruno", 26);
        Pessoa pessoa2 = new Pessoa("Bruna", 26);
        Pessoa pessoa3 = new Pessoa("Brune", 26);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista é: " + listaDePessoas.size());
        System.out.println("A primeira pessoa da lista é: " + listaDePessoas.get(0));

        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa : listaDePessoas){
            System.out.println(pessoa);
        }

    }
}
