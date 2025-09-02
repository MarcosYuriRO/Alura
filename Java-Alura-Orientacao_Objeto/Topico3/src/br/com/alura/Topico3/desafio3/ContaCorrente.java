package br.com.alura.Topico3.desafio3;

public class ContaCorrente extends ContaBancaria{
    private double taxa = 0.05;
    public void cobrarTaxaMensal(){
        saldo -= taxa * saldo;
        System.out.println("Taxa Mensal Descontada.");
    }
}
