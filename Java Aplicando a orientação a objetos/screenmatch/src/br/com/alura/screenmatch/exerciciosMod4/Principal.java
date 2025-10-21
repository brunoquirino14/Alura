package br.com.alura.screenmatch.exerciciosMod4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Exercicio1
//        ConversorMoeda moeda = new ConversorMoeda();
//        System.out.println("Digite o valor para conversão: ");
//        double valor = sc.nextDouble();
//        moeda.converterDolarParaReal(valor);
//
         //Exercicio2
//        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
//        System.out.println("Informe a altura da sala: ");
//        int altura = sc.nextInt();
//        System.out.println("Informe a largura da sala: ");
//        int largura = sc.nextInt();
//        calculadora.calcularArea(altura,largura);
//        calculadora.calcularPerimetro(altura,largura);

        //Exercicio3
//        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
//        System.out.println("Entre com o número que deseja fazer a tabuada: ");
//        int Numero = sc.nextInt();
//        tabuada.mostrarTabuada(Numero);

        //Exercicio4
//        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
//        System.out.println("Qual temperatura em Celsius deseja converter? ");
//        double temp1 = sc.nextDouble();
//        conversor.celsiusParaFahrenheit(temp1);
//        System.out.println("Qual temperatura em Fahrenheit deseja converter? ");
//        double temp2 = sc.nextDouble();
//        conversor.fahrenheitParaCelsius(temp2);

        //Exercício5
//        Livro livro = new Livro();
//        ProdutoFisico fisico = new ProdutoFisico();
//        System.out.println("Qual o valor do produto? ");
//        int valor = sc.nextInt();
//        System.out.println("O valor do produto com desconto é: R$"+ (int)livro.calcularPrecoFinal(valor));
//        System.out.println("O valor do produto sem desconto é: R$" + (int)fisico.calcularPrecoFinal(valor));

    Servico servico = new Servico();
    Produto produto = new Produto();
        System.out.println("Escreva o valor do produto: ");
        double valor = sc.nextDouble();
        System.out.println("Escreva a quantidade do produto: ");
        int quant = sc.nextInt();
        System.out.println("Valor final do produto: R$"+(int)produto.calculaPrecoFinal(quant, valor));

        System.out.println("Escreva o valor do serviço: ");
        double valor1 = sc.nextDouble();
        System.out.println("Escreva a quantidade do serviço: ");
        int quant1 = sc.nextInt();
        System.out.println("Valor final do serviço: R$"+(int)servico.calculaPrecoFinal(quant1, valor1));

    }
}
