package StringsRegex.Desafio06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código de referência: ");
        String referenceCode = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z]{3}-[0-9]{4}$");
        Matcher matcher = pattern.matcher(referenceCode);


        if (matcher.find()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência está inválido.");
        }
    }
}
