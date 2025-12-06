package CondicionaisIfElse.Desafio07;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo:");
        double loanRequest = scanner.nextDouble();;

        if (loanRequest >= 1000 && loanRequest <= 5000){
            System.out.println("Empréstimo solicitado!");
        } else {
            System.out.println("O valor " + loanRequest + " não está dentro do " +
                    "intervalo permitido para empréstimo.");
        }
    }
}
