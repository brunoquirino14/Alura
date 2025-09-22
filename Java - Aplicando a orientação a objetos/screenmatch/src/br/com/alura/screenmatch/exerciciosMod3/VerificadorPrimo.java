package br.com.alura.screenmatch.exerciciosMod3;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero){
        if (verificarPrimalidade(numero)) {
            System.out.println("Número primo");
        } else {
            System.out.println("Número não é primo");
        }
    }
}
