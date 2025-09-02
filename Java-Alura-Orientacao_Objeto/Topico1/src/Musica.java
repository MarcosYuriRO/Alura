public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibafichaTec(){
        System.out.println("Nome da Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }

    void avalieMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double calculeMedia(){
        return avaliacao / numAvaliacoes;
    }
}
