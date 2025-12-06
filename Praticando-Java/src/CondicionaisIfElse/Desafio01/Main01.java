package CondicionaisIfElse.Desafio01;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro e saiba se ele é par ou ímpar:");
        int chosenNumber = scanner.nextInt();

        String numberType = (chosenNumber % 2 == 0) ? "par" :
                "ímpar";
        System.out.printf("O número %d é %s", chosenNumber, numberType);
    }
}
