public class Aluno {
    private String nome;
    private double notas = 15;
    private int quantidadeNotas = 3;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double notas) {
        this.notas = notas;
    }

    public int getQuantidadeNotas() {
        return quantidadeNotas;
    }

    public void setQuantidadeNotas(int quantidadeNotas) {
        this.quantidadeNotas = quantidadeNotas;
    }

    public double calculeMedia(){
        return notas/quantidadeNotas;
    }
}
