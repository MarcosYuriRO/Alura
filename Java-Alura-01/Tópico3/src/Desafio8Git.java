import java.util.Scanner;

public class Desafio8Git {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        int somaTotal = 0;

        while (somaTotal <= 100) {
            System.out.println("Digite um número natural:");
            int numero = leitura.nextInt();
            somaTotal += numero;
        }
    }
}
