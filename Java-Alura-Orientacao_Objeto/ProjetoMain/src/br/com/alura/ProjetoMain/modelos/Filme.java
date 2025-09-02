package br.com.alura.ProjetoMain.modelos;

import br.com.alura.ProjetoMain.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegueMedia() / 2;
    }
}