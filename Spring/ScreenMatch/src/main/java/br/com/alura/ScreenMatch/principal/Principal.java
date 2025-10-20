package br.com.alura.ScreenMatch.principal;

import br.com.alura.ScreenMatch.model.DadosEpisodio;
import br.com.alura.ScreenMatch.model.DadosSerie;
import br.com.alura.ScreenMatch.model.DadosTemporada;
import br.com.alura.ScreenMatch.model.Episodio;
import br.com.alura.ScreenMatch.service.ConsumoAPI;
import br.com.alura.ScreenMatch.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=d1953970";

    public void exibeMenu() {
        System.out.println("Digite o nome da série para busca:");
        String nomeSerie = leitura.nextLine();
        String json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= dados.totalTemporadas(); i++) {

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

        /*List<String> nomes = Arrays.asList("Jacque", "Iasmin", "Paulo", "Rodrigo", "Nico");

        nomes.stream()
                //Sorteie
                .sorted()
                .limit(3)
                //filtre para pegar apenas os que cumpram com determinada regra
                .filter(n -> n.startsWith("N"))
                //.map() = transformador
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);*/


        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                //Pega todos episodios de todas temporadas
                .flatMap(t -> t.episodios().stream())
                //Coloca todos episódios em uma única lista
                .collect(Collectors.toList());

        /*System.out.println("\nTop 10 episódios:");
        dadosEpisodios.stream()
                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
                //Pega a avaliacao de cada episódio e mostra eles do melhor avaliado pro pior
                .peek(e -> System.out.println("Primeiro Filtro(N/A " + e))
                //.peek: serve para espiar os elementos da stream, mas sem os alterar
                //Neste caso, imprime um comentário após cada operacao
                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
                .peek(e -> System.out.println("Ordenacao " + e))
                .limit(10)
                .peek(e -> System.out.println("Limite " + e))
                .map(e -> e.titulo().toUpperCase())
                .peek(e -> System.out.println("Mapeamento " + e))
                .forEach(System.out::println);*/

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d))
                ).collect(Collectors.toList());


        episodios.forEach(System.out::println);

        /*System.out.println("Digite um trecho do título do episódio");
        String trechoTitulo = leitura.nextLine();
        Optional<Episodio> episodioBuscado = episodios.stream()
                //Optional: Container que tem chance de encontrar e chance de não
                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
                //.findFirst(): Operacao final de encontrar o primeiro valor captado
                .findFirst();
        if (episodioBuscado.isPresent()){
            System.out.println("Episódio encontrado!");
            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
        } else {
            System.out.println("Episódio não encontrado.");
        }*/


        /*System.out.println("A partir de que ano voce deseja ver os episódios?");
        //Depois de nextInt, sempre use um nextLine vazio
        int ano = leitura.nextInt();
        leitura.nextLine();

        LocalDate dataBusca = LocalDate.of(ano, 1, 1);

        //Formata para, ao invés de ano/mes/dia, se torna dia/mes/ano
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM//yyyy");
        episodios.stream()
                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
                .forEach(e -> System.out.println(
                        "Temporada: " + e.getTemporada() +
                                " Episódio: " + e.getTitulo() +
                                " Data Lancamento: " +e.getDataLancamento().format(formatador)
                ));*/

        Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                //Pega todas temporadas e exibe a avaliacao de cada
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));
        System.out.println(avaliacoesPorTemporada);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));

        System.out.println("Média: " + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade:" + est.getCount());
    }
}