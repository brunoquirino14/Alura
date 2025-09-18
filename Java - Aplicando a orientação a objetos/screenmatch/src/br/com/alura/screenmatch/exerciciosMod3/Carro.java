package br.com.alura.screenmatch.exerciciosMod3;

public class Carro {
    private String modelo;
    private double precoMedioDoAno1;
    private double precoMedioDoAno2;
    private double precoMedioDoAno3;

    public double getPrecoMedioDoAno1() {
        return precoMedioDoAno1;
    }

    public void setPrecoMedioDoAno1(double precoMedioDoAno1) {
        this.precoMedioDoAno1 = precoMedioDoAno1;
    }

    public double getPrecoMedioDoAno3() {
        return precoMedioDoAno3;
    }

    public void setPrecoMedioDoAno3(double precoMedioDoAno3) {
        this.precoMedioDoAno3 = precoMedioDoAno3;
    }

    public double getPrecoMedioDoAno2() {
        return precoMedioDoAno2;
    }

    public void setPrecoMedioDoAno2(double precoMedioDoAno2) {
        this.precoMedioDoAno2 = precoMedioDoAno2;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void calculaMaior(){
        if(precoMedioDoAno1 >= precoMedioDoAno2){
            if (precoMedioDoAno1>= precoMedioDoAno3){
                System.out.println("O maior preço é o do ano 1!");
            }
        } else if (precoMedioDoAno2 >= precoMedioDoAno1) {
            if (precoMedioDoAno2 >= precoMedioDoAno3){
                System.out.println("O maior preço é o do ano 2!");
            }
        } else {
            System.out.println("O maior preço é o do ano 3!");
        }
    }

    public void calculaMenor(){
        if(precoMedioDoAno1 <= precoMedioDoAno2){
            if (precoMedioDoAno1<= precoMedioDoAno3){
                System.out.println("O menor preço é o do ano 1!");
            }
        } else if (precoMedioDoAno2 <= precoMedioDoAno1) {
            if (precoMedioDoAno2 <= precoMedioDoAno3){
                System.out.println("O menor preço é o do ano 2!");
            }
        } else {
            System.out.println("O menor preço é o do ano 3!");
        }
    }
}
