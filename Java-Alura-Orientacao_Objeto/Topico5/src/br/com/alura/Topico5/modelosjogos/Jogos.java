package br.com.alura.Topico5.modelosjogos;

public class Jogos {
    private String nome;
    private int anoDeLancamento;

    public void informacoesBasicas(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalieJogo(double historia, double arte, double jogabilidade){
        double notaGeral = (historia + arte + jogabilidade) / 3;
        System.out.println("Sua nota geral ao jogo: " + notaGeral);
    }


    //Getters e Setters:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
}