public class ProdutoPerecivel extends Produto{
    private int mesesValidade;

    public ProdutoPerecivel(String nome, int mesesValidade) {
        super(nome);
        this.mesesValidade = mesesValidade;
    }

    @Override
    public String toString() {
        return this.getNome() + " (Validade em Meses: " + this.getMesesValidade() + ")";
    }

    public int getMesesValidade() {
        return mesesValidade;
    }
}
