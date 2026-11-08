public class Main {
    public static void main(String[] args) {
    //Desafio 2
    IdadePessoa pessoa1 = new IdadePessoa();
    pessoa1.setIdade(18);

    pessoa1.verifiqueIdade();

    //Desafio 3:
    Produto produto1 = new Produto();
    produto1.setPreco(50);

    produto1.apliqueDesconto(20);

    //Desafio 4:
    Aluno aluno1 = new Aluno();
        System.out.println("Somatório das Notas: " + aluno1.getNota());
        System.out.println("Quantidade de Provas avaliadas: " + aluno1.getQuantidadeNotas());

        System.out.println("Média: " + aluno1.calculeMedia());

    //Desafio 5:
    Livro livro1 = new Livro();
    livro1.setTitulo("Quincas Borba");
    livro1.setAutor("Machado de Assis");

    livro1.exibaDetalhes();
    }
}