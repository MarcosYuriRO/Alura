package br.com.alura.Topico4.desafio5;

public class Livro implements Calculavel{
    private double precoPadraolivro = 30;
    private double descontoLivro = 0.15;

    @Override
    public double calcularPrecoFinal() {
        return precoPadraolivro - precoPadraolivro * descontoLivro;
    }
}
