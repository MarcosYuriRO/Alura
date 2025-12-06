package CondicionaisIfElse.Desafio04;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numberOne = scanner.nextInt();
        System.out.println("Agora, digite mais um número:");
        int numberTwo = scanner.nextInt();

        if (numberOne != numberTwo){
            int biggestNumber = Math.max(numberOne, numberTwo);
            System.out.println("O maior número é o " + biggestNumber);
        } else {
            System.out.println("Os dois números são iguais");
        }
    }
}
