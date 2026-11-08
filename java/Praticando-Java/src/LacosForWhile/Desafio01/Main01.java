package LacosForWhile.Desafio01;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus:");
        int stepsQuantity = scanner.nextInt();

        for (int i = 1; i <= stepsQuantity; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("\nVocê chegou ao topo!");
    }
}
