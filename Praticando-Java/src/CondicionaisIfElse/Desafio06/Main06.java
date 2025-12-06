package CondicionaisIfElse.Desafio06;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana:");
        String dayOfWeek = scanner.nextLine().trim();

        if (dayOfWeek.equalsIgnoreCase("Sábado") ||
                dayOfWeek.equalsIgnoreCase("Domingo")){
            System.out.println(dayOfWeek + " não é um dia útil.");
        } else {
            System.out.println(dayOfWeek + " é um dia útil.");
        }
    }
}
