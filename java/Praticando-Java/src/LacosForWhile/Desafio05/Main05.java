package LacosForWhile.Desafio05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os números: ");
            int chosenNumber = scanner.nextInt();
            numbers.add(chosenNumber);
        }

        int biggestNumber = 0;
        for (int number : numbers){
            biggestNumber = Math.max(biggestNumber, number);
        }
        System.out.println("\nO maior número é: " + biggestNumber);

    }
}
