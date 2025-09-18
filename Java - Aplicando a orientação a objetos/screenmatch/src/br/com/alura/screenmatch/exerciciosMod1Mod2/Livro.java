package br.com.alura.screenmatch.exerciciosMod1Mod2;

public class Livro {
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibeDetalhes(){
        System.out.println(autor);
        System.out.println(titulo);
    }
}
