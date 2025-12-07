package LacosForWhile.Desafio04;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        int result = number;

        for (int i = 1; i < number; i++) {
            result *= i;
        }
        System.out.println("O fatorial de " + number + " é: " + result);
    }
}
