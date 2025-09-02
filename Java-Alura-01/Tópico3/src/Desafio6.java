import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Escreva um número inteiro para ver o seu fatorial:");
        int numeroEscolhido = leitura.nextInt();
        int multiplicador = 1;

        for (int i = 1; i <= numeroEscolhido; i++) {
            multiplicador *= i;
        }
        System.out.println("O fatorial de " + numeroEscolhido + " é: " + multiplicador);
    }
}
