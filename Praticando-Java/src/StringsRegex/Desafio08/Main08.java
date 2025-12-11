package StringsRegex.Desafio08;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String text = scanner.nextLine();
        
        Pattern pattern = Pattern.compile("^#+$");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Hashtags encontradas: " + matcher.group(text));
        } else {
            System.out.println("Nenhuma hashtag encontrada.");
        }
    }

}
