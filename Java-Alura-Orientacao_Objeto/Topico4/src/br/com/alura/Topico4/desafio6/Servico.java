package br.com.alura.Topico4.desafio6;

public class Servico implements Vendavel{
    private double precoPadrao;
    private double desconto;

    @Override
    public void apliqueDescontos() {
        desconto = precoPadrao / 3;
        System.out.println("Desconto para crianças: " + desconto);
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