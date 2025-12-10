package StringsRegex.Desafio07;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.find()) {
            System.out.println("O CPF " + cpf + " está no formato válido");
            
        } else {
            System.out.println("O CPF " + cpf + " está no formato inválido");
        }
    }
}