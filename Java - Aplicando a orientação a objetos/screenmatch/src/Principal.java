import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

public class Principal {
    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//        meuFilme.setNome("O poderoso chefão");
//        meuFilme.setAnoDeLancamento(1970);
//        meuFilme.setDuracaoEmMinutos(180);
//        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
//
//        meuFilme.exibeFichaTecnica();
//        meuFilme.avalia(8);
//        meuFilme.avalia(5);
//        meuFilme.avalia(10);
//        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
//        System.out.println(meuFilme.pegaMedia());
//        //meuFilme.somaDasAvaliacoes = 10;
//        //meuFilme.totalDeAvaliacoes = 1;
//        //System.out.println(meuFilme.pegaMedia());
//
//        Serie lost = new Serie();
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
//        lost.exibeFichaTecnica();
//        lost.setTemporadas(10);
//        lost.setEpisodiosPorTemporada(10);
//        lost.setMinutosPorEpisodio(50);
//        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
//
//        Filme outroFilme = new Filme();
//        outroFilme.setNome("Avatar");
//        outroFilme.setAnoDeLancamento(2023);
//        outroFilme.setDuracaoEmMinutos(200);
//
//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        calculadora.inclui(meuFilme);
//        calculadora.inclui(outroFilme);
//        calculadora.inclui(lost);
//        System.out.println(calculadora.getTempoTotal());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(meuFilme);
//
//        Episodio episodio = new Episodio();
//        episodio.setNumero(1);
//        episodio.setSerie(lost);
//        episodio.setTotalVisualizacoes(300);
//        filtro.filtra(episodio);

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for (int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++){
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolhadev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++){
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++){
            meuPodcast.reproduz();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}