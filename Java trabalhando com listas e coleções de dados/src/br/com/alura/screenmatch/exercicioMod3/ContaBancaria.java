package br.com.alura.screenmatch.exercicioMod3;

public class ContaBancaria {
    private String conta;
    private double saldo;

    public ContaBancaria(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getConta() {
        return conta;
    }
}
