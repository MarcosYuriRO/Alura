public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void apliqueDesconto(double porcentagemDesconto){
        double valorComDesconto = preco - (preco * porcentagemDesconto / 100);
        System.out.println("Valor pós Desconto: " + valorComDesconto);
    }
}