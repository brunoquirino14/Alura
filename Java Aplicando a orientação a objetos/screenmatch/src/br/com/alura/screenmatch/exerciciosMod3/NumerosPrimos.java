package br.com.alura.screenmatch.exerciciosMod3;

public class NumerosPrimos {

    int teste;

    public boolean verificarPrimalidade(int numero){
        if (numero<=1){
            return true;
        }
        for (int i = 2; i < numero; i++){
            teste++;
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
    public void listarPrimos(int numero){
        System.out.println("Listando números até "+numero+" :");
        for (int i=2;i<=numero;i++){
            if (verificarPrimalidade(i)){
                System.out.println(i+ " ");
            }
        }
    }
}
