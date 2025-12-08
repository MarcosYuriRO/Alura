package br.com.alura.Contador;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    private ObjectMapper mapper = new ObjectMapper();

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", pessoaResponsavel='" + pessoaResponsavel + '\'' +
                '}';
    }

    public <T> T obterDados(String json, Class<T> classe) {
        try {
            //Lê o json e tenta o transformar na classe definida
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
