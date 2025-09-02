import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número Natural para rececber sua tabuada de 1 a 10!");
        int numeroEscolhido = leitura.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultados = numeroEscolhido * i;
            System.out.println(numeroEscolhido + " * " + i + " = " + resultados);
        }
    }
}