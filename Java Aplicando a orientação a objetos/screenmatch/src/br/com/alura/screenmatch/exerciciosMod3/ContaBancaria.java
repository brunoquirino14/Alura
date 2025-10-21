package br.com.alura.screenmatch.exerciciosMod3;

public class ContaBancaria {
    protected double saldo;
    private int numeroConta;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double depositar(double valor){
        saldo = valor + saldo;
        return saldo;
    }
    public double sacar(double valor){
        if (saldo < valor){
            System.out.println("Você não tem tanta grana assim!");
            return valor;
        }else{
            saldo = saldo - valor;
            return saldo;
        }
    }

    public void consultarSaldo(){
        System.out.println("Seu saldo é: " + saldo);
    }
}
