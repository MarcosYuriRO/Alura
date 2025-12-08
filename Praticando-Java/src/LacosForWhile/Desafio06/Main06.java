package LacosForWhile.Desafio06;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int password = 1234;
        boolean isAllowed = false;
        int attempts = 3;

        while (attempts != 0 && !isAllowed){
            System.out.print("Digite a sua senha: ");
            int passwordAttempt = scanner.nextInt();

            if (passwordAttempt == password){
                System.out.println("Senha correta! Acesso concedido.");
                isAllowed = true;
            } else {
                attempts--;
                String wordAttempt = attempts == 1 ? " tentativa restante." :
                        " tentativas restantes.";
                System.out.println("Senha incorreta. Você tem " + attempts + wordAttempt);
            }
        }
        if (!isAllowed){
            System.out.println("Limite de tentativas alcançado. Conta bloqueada temporariamente.");
        }
    }
}
