package br.com.alura.Topico4.desafio5;

public class ProdutoFisico implements Calculavel{
    private double precoPadraoProduto = 140;
    private double frete = 24.8;
    @Override
    public double calcularPrecoFinal() {
        return precoPadraoProduto + frete;
    }
}
