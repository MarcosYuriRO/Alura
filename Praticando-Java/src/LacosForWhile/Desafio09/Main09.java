package LacosForWhile.Desafio09;

import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 10 == 5){
                continue;
            } else {
                System.out.println(i);
            }

        }
    }
}
