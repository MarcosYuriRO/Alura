import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número Inteiro:");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
        System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}
