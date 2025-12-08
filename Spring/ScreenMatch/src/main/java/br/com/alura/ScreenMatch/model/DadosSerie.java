package br.com.alura.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonAlias: O nome da variável é lido com o valor colocado entre aspas
    //(Pode colocar mais de um valor a ser lido)

//@JsonProperty: Ele lê e também escreve no código o valor colocado entre aspas

@JsonIgnoreProperties(ignoreUnknown = true)
//Tudo do json que não for um dos atributos definidos abaixo, será ignorado na hora da leitura

public record DadosSerie(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
