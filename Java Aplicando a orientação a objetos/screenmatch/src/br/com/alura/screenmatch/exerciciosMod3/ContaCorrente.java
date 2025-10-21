package br.com.alura.screenmatch.exerciciosMod3;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal(){
        saldo = saldo - 24.90;
        System.out.println("A tarifa mensal no valor de R$24,90 foi aplicada!");
        System.out.println("Seu saldo agora é: " + saldo);
    }
}
