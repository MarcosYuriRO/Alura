package CondicionaisIfElse.Desafio08;

import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro lado:");
        int firstSide = scanner.nextInt();
        System.out.print("Digite o segundo lado:");
        int secondSide = scanner.nextInt();
        System.out.print("Digite o terceiro lado:");
        int thirdSide = scanner.nextInt();

        int firstSmallest = Math.min(firstSide, secondSide);
        int biggestStepOne = Math.max(firstSide, secondSide);
        int secondSmallest = Math.min(biggestStepOne, thirdSide);
        int biggestSide = Math.max(biggestStepOne, thirdSide);
        int smallestsSum = firstSmallest + secondSmallest;

        if (smallestsSum > biggestSide){
            System.out.println("Os lados podem formar um triângulo.");
        } else {
            System.out.println("Os lados não podem formar um triângulo.");
        }
    }
}
