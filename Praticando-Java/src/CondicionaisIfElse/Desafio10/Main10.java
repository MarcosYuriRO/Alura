package CondicionaisIfElse.Desafio10;

import java.util.Scanner;

public class Main10     {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do(a) doador(a):");
        int donorAge = scanner.nextInt();
        System.out.println("Digite o peso do(a) doador(a):");
        double donorWeight = scanner.nextDouble();

        if (donorAge >= 18 && donorAge <= 65 && donorWeight > 50){
            System.out.println("Doador compatível!");
        } else {
            System.out.println("Doador incompatível.");
            if (donorAge < 18 || donorAge > 65) {
                System.out.println("Deve ter entre 18 e 65 anos.");
            }
            if (donorWeight <= 50){
                System.out.println("Deve pesar mais de 50 kg.");
            }
        }
    }
}
