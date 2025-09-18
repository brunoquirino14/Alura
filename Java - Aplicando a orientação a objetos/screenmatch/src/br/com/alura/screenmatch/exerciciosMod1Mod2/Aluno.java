package br.com.alura.screenmatch.exerciciosMod1Mod2;

public class Aluno {
    private String nome;
    int idade;
    private double notas;
    private int quantidadeNotas = 0;

    void exibeFicha(){
        System.out.println("Informações: ");
        System.out.println(nome);
        System.out.println(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        quantidadeNotas++;
    }

    public double calcularMedia(double notas){
        this.notas = notas/quantidadeNotas;
        return this.notas;
    }
}
