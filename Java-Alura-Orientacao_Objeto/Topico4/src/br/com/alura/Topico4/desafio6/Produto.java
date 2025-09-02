package br.com.alura.Topico4.desafio6;

public class Produto implements Vendavel{
    private double precoPadrao;
    private double desconto;

    @Override
    public void apliqueDescontos() {
        desconto = precoPadrao * 0.25;
        System.out.println("Em caso de compra de 4 unidades, desconto de: " + desconto);
    }

    @Override
    public void calculePrecoTotal() {
        double precoTotal = precoPadrao - desconto;
        System.out.println("Valor total do serviço: " + precoTotal);
    }

    public void setPrecoPadrao(double precoPadrao) {
        this.precoPadrao = precoPadrao;
    }
}