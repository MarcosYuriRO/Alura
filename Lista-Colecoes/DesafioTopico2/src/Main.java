import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Produto produto1 = new Produto("Escova");
    Produto produto2 = new Produto("Televisão");
    Produto produto3 = new ProdutoPerecivel("Banana", 1);
    Produto produto4 = new ProdutoPerecivel("Café", 12);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);

        System.out.println("Tamanho do carrinho: " + listaDeProdutos.size());
        System.out.println(listaDeProdutos.get(2));
        System.out.println(listaDeProdutos);
    }
}