public class Produto {
    private String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
