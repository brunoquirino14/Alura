package br.com.alura.screenmatch.exerciciosMod4;

public class Servico implements Vendavel{
    @Override
    public double calculaPrecoFinal(int quantidade, double valor) {
        if (quantidade >= 10 && quantidade <=100){
            valor = valor -(valor*0.2);
            System.out.println("Com desconto de 20%!");
            return valor;
        } else if (quantidade >100) {
            valor = valor -(valor*0.5);
            System.out.println("Com desconto de 50%!");
            return valor;
        } else {
            System.out.println("Sem desconto!");
            return valor;
        }
    }
}
