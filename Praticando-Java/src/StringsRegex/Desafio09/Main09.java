package StringsRegex.Desafio09;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main09{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String password = scanner.nextLine();

        Pattern pattern = Pattern.compile("//w[A-Z]+//w[a-z]+//d+//W{8,}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida.");
        }
    }
}