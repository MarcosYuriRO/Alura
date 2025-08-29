import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa();
    Pessoa pessoa2 = new Pessoa();
    Pessoa pessoa3 = new Pessoa();

    pessoa1.setNome("João");
    pessoa1.setIdade(19);
    pessoa2.setNome("Maria");
    pessoa2.setIdade(45);
    pessoa3.setNome("Joaquim");
    pessoa3.setIdade(8);

    ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    listaPessoas.add(pessoa1);
    listaPessoas.add(pessoa2);
    listaPessoas.add(pessoa3);
    System.out.println("Quantidadade de pessoas: " + listaPessoas.size());
    System.out.println(listaPessoas.get(0));
    System.out.println(listaPessoas);
    }
}