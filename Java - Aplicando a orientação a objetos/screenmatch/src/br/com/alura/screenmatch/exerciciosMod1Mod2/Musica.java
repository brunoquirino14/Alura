package br.com.alura.screenmatch.exerciciosMod1Mod2;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFicha(){
        System.out.println("Ficha técnica: ");
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
        System.out.println(numAvaliacoes);
    }

    double avaliarMusica(double nota){
        numAvaliacoes++;
        return avaliacao += nota;
    }

    void calculaMedia(){
        System.out.println("Média das avaliações: "+ avaliacao/numAvaliacoes);
    }
}
