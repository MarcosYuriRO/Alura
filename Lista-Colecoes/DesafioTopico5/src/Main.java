import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Produto> lista = new ArrayList<>();

        System.out.println("Digite o limite do seu cartão:");
        int limite = scanner.nextInt();

        int montante = 0;
        int escolha = 1;
        int saldo = limite;

        while (montante <= saldo || escolha != 0) {
            String a = scanner.nextLine();
            System.out.println("Digite o seu produto:");
            String produtoEscrito = scanner.nextLine();


            System.out.println("Digite o valor da sua compra:");
            int valorCompra = scanner.nextInt();

            if (valorCompra <= saldo) {
                Produto produto = new Produto(produtoEscrito, valorCompra);
                lista.add(produto);
                montante += valorCompra;
                if (saldo < montante) {
                    break;
                } else {
                    saldo -= montante;
                    System.out.println("Compra Realizada!");
                    System.out.println("Digite 0 para sair ou 1 para continuar.");
                    escolha = scanner.nextInt();
                }
               if (escolha != 1 && escolha != 0){
                   System.out.println("Erro! Tente novamente:");
               } else if (escolha == 0) {
                   break;
               }
            } else {
                System.out.println("Saldo Insuficiente!");
                break;
            }
        }
        if (montante > limite) {
            System.out.println("Saldo excedido!");
        }
        System.out.println("Compras realizadas:");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("Saldo restante: " + (saldo));

    }
}