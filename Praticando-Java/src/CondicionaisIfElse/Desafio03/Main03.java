package CondicionaisIfElse.Desafio03;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "Java11";
        System.out.print("Digite a senha:");
        String writtenPassword = scanner.nextLine();

        if (writtenPassword.equals(password)){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
