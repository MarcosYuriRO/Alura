package br.com.alura.Topico5.modelosjogos;

public class JogosIndie extends Jogos implements Informar{
    private String criador;
    private int crowdfunding;

    @Override
    public void exibaInformacoesBasicas(){
        informacoesBasicas();
        System.out.println("Criador(es): " + criador);
        System.out.println("Valor Arrecadado em Financiamento Coletivo: " + crowdfunding);
    }


    //Getters e Setters:

    public String getCriador() {
        return criador;
    }

    public void setCriador(String criador) {
        this.criador = criador;
    }

    public int getCrowdfunding() {
        return crowdfunding;
    }

    public void setCrowdfunding(int crowdfunding) {
        this.crowdfunding = crowdfunding;
    }
}