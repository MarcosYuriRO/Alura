package StringsRegex.Desafio02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Texto: ");
        String text = scanner.nextLine();

        System.out.println("Texto em maiúsculas: " + text.toUpperCase());
        System.out.println("Texto em minúsculas: " + text.toLowerCase());

    }
}
