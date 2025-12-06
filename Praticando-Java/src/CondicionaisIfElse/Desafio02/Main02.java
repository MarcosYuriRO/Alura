package CondicionaisIfElse.Desafio02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do(a) aluno(a):");
        double grade = scanner.nextDouble();

        if (grade >= 5) {
            if (grade >= 7){
                System.out.println("O(A) estudante teve média " + grade + " e foi aprovado(a)!");
            } else {
                System.out.println("O(A) estudante teve média " + grade + " e está de recuperação.");
            }
        } else {
            System.out.println("O(A) estudante teve média " + grade + " e foi reprovado(a).");
        }
    }
}
