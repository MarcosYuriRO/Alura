package LacosForWhile.Desafio08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();

        String writing = "";
        while(!writing.equalsIgnoreCase("Fim")){
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            writing = scanner.nextLine();
            if (!writing.equalsIgnoreCase("Fim")) {
                int number = Integer.parseInt(writing);

                if (number > 0) {
                    positiveNumbers.add(number);
                }
                if (number < 0) {
                    negativeNumbers.add(number);
                }
            }
        }

        System.out.println("Números Positivos: " + positiveNumbers.size());
        System.out.println("Números Negativos: " + negativeNumbers.size());
    }
}
