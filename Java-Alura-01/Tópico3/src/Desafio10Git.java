import java.util.Scanner;

public class Desafio10Git {
    public static void main(String[] args) {

        Scanner leitura = new Scanner (System.in);

        System.out.println("Escreva uma frase");
        String frase = leitura.nextLine();
        System.out.println("Agora, digite um número Natural");
        int vezes = leitura.nextInt();

        while (vezes > 0) {
            System.out.println(frase);
            vezes--;
        }
    }
}
