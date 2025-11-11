package br.com.alura.screenmatch.exercicioMod3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Cachorro ravena = new Cachorro();
        ArrayList<Cachorro> listaDeCachorros = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        Animal animal = new Cachorro();

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("O objeto é um cachorro!");
        }else {
            System.out.println("O objeto não é um cachorro!");
        }

      ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        Produto produto1 = new Produto("Sabão", 12.99);
        listaDeProdutos.add(produto1);
        Produto produto2 = new Produto("Abacate", 2.99);
        listaDeProdutos.add(produto2);
        double total = 0;
        int quantidade = 0;
        for(Produto p: listaDeProdutos){
            total = total + p.getValor();
            quantidade++;
        }
        System.out.println("A média é: " + total/quantidade);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        Quadrado quadrado = new Quadrado(12);
        listaDeFormas.add(quadrado);
        Circulo circulo = new Circulo(5);
        listaDeFormas.add(circulo);

        for(Forma forma: listaDeFormas){
            System.out.println("Área: "+forma.calcularArea());
        }

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        ContaBancaria conta1 = new ContaBancaria("01", 2000);
        ContaBancaria conta2 = new ContaBancaria("02", 5000);
        ContaBancaria conta3 = new ContaBancaria("03", 8002);
        ContaBancaria conta4 = new ContaBancaria("04", 4000);
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);
        ContaBancaria contaMaiorSaldo = listaDeContas.getFirst();

        for (ContaBancaria conta : listaDeContas){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("A conta com o maior saldo: "+contaMaiorSaldo.getConta());
        System.out.println("Saldo de R$ "+contaMaiorSaldo.getSaldo());


    }
}
