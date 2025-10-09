package br.com.alura.ScreenMatch;

import br.com.alura.ScreenMatch.model.DadosEpisodio;
import br.com.alura.ScreenMatch.model.DadosSerie;
import br.com.alura.ScreenMatch.service.ConsumoAPI;
import br.com.alura.ScreenMatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();
		String json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=d1953970");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		//Coloca como parâmetros do DadosSerie, dados obtidos do json da serie, conseguidos através do ConverteDados
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);

		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
	}
}