package br.com.alura.screenmatch.exerciciosMod3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Exercício 1
//        ModeloCarro chevette = new ModeloCarro();
//        System.out.println("Entre com o modelo do carro:");
//        chevette.setModelo(sc.nextLine());
//        System.out.println("Entre com a cor do carro:");
//        chevette.setCor(sc.nextLine());
//        System.out.println("Entre com o valor do ano 1:");
//        chevette.setPrecoMedioDoAno1(sc.nextDouble());
//        System.out.println("Entre com o valor do ano 2:");
//        chevette.setPrecoMedioDoAno2(sc.nextDouble());
//        System.out.println("Entre com o valor do ano 3:");
//        chevette.setPrecoMedioDoAno3(sc.nextDouble());
//        System.out.println("Estes são os menores e maiores preços do seu carro:");
//        System.out.println("Carro na cor: "+chevette.getCor());
//        chevette.calculaMenor();
//        chevette.calculaMaior();

        //Exercicio 2
//        Gato gatito = new Gato();
//        Cachorro doguinho = new Cachorro();
//
//        gatito.arranharMoveis();
//        doguinho.abanarRabo();

        //Exercicio 3
//        ContaCorrente corrente = new ContaCorrente();
//        System.out.println("Digite seu saldo agora: ");
//        corrente.setSaldo(sc.nextDouble());
//        System.out.println("Digite o valor do seu saque: ");
//        corrente.sacar(sc.nextDouble());
//        System.out.println("Digite o valor do seu deposito: ");
//        corrente.depositar(sc.nextDouble());
//        corrente.consultarSaldo();
//        corrente.cobrarTarifaMensal();


        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }

}
