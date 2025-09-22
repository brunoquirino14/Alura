package br.com.alura.screenmatch.exerciciosMod4;

public class Produto implements Vendavel{
    @Override
    public double calculaPrecoFinal(int quantidade, double valor) {
        if (quantidade >= 2 && quantidade <=5){
            valor = valor -(valor*0.1);
            System.out.println("Com desconto de 10%!");
            return valor;
        } else if (quantidade >5) {
            valor = valor -(valor*0.2);
            System.out.println("Com desconto de 20%!");
            return valor;
        } else {
            System.out.println("Sem desconto!");
            return valor;
        }
    }
}
