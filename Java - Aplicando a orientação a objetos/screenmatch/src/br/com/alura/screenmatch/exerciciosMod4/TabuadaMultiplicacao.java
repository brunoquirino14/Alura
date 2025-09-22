package br.com.alura.screenmatch.exerciciosMod4;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Essa é a tabuada do número "+numero+" :");
        System.out.println("1x"+numero+" = "+numero*1);
        System.out.println("2x"+numero+" = "+numero*2);
        System.out.println("3x"+numero+" = "+numero*3);
        System.out.println("4x"+numero+" = "+numero*4);
        System.out.println("5x"+numero+" = "+numero*5);
        System.out.println("6x"+numero+" = "+numero*6);
        System.out.println("7x"+numero+" = "+numero*7);
        System.out.println("8x"+numero+" = "+numero*8);
        System.out.println("9x"+numero+" = "+numero*9);
        System.out.println("10x"+numero+" = "+numero*10);
    }
}
