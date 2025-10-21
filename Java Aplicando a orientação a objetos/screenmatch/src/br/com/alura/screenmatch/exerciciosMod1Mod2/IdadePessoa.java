package br.com.alura.screenmatch.exerciciosMod1Mod2;

public class IdadePessoa {
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade(){
        if(this.idade >= 18){
            System.out.println("Maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
