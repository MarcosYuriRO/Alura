package StringsRegex.Desafio04;

import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String text = scanner.nextLine();

        System.out.print("Digite a palavra: ");
        String word = scanner.nextLine();

        if (text.contains(word)) {
            System.out.println("A palavra \"" + word + "\" está presente no texto.");
        } else {
            System.out.println("A palavra \"" + word + "\" não está presente no texto.");
        }
        scanner.close();
    }
}
