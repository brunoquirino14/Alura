package br.com.alura.screenmatch.exerciciosMod3;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int ultimoPrimo){
        int proximoNumero = ultimoPrimo + 1;
        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }
}
