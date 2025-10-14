package br.com.alura.ScreenMatch.principal;

import br.com.alura.ScreenMatch.model.DadosEpisodio;
import br.com.alura.ScreenMatch.model.DadosSerie;
import br.com.alura.ScreenMatch.model.DadosTemporada;
import br.com.alura.ScreenMatch.service.ConsumoAPI;
import br.com.alura.ScreenMatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=d1953970";

    public void exibeMenu(){
        System.out.println("Digite o nome da série para busca:");
        String nomeSerie = leitura.nextLine();
        String json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i<= dados.totalTemporadas(); i++){

            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        //para cada item/temporada na lista "temporadas", exibe o json dela
        temporadas.forEach(System.out::println);

        /*for (int i = 0; i < dados.totalTemporadas(); i++){
            //Pega uma temporada por vez e pega seus episódios
            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
            //Faz uma lista de episodios de uma determinada temporada e os adiciona em ordem
            for (int j = 0; j < episodiosTemporada.size(); j++){
                //Exibe cada titulo dos episodios de cada temporada em ordem, até acabar a lista de episódios
                System.out.println(episodiosTemporada.get(j).titulo());
            }
        }*/

        //Faz o mesmo que o código comentado (t = temporadas, e = episodiosTemporada
        //Para cada temporada/t, pega seus episódios
        //Para cada episódio/e de uma temporada, exibe seu título
        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));
        //Para cada temporada, exibe ela
        //temporadas.forEach(System.out::println);
    }
}