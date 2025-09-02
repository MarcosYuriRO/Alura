import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroEscolhido = leitura.nextInt();

        if (numeroEscolhido >= 0) {
            System.out.println(numeroEscolhido + " é positivo.");
        } else {
            System.out.println(numeroEscolhido + " é negativo");
        }
    }
}