package br.com.alura.ProjetoMain.calculos;

import br.com.alura.ProjetoMain.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    /*public void inclui(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
    public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }*/
}
