package StringsRegex.Desafio05;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double value = scanner.nextDouble();

        System.out.printf("Valor formatado: R$ %.2f", value);
    }

}
