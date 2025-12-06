package CondicionaisIfElse.Desafio11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Código de Acesso:");
        int accessCode = scanner.nextInt();
        System.out.print("Digite o Nível de Permissão:");
        int permissionLevel = scanner.nextInt();

        int code = 2023;
        int[] levels = {1, 2, 3};
        boolean levelFound = false;

        for (int number : levels){
            if (number == permissionLevel) {
                levelFound = true;
                break;
            }
        }

        if (accessCode == code && levelFound){
            System.out.println("Acesso Permitido.");
        } else {
            System.out.println("Acesso Negado.");
            if (accessCode != code) {
                System.out.println("Código de Acesso Incompatível.");
            }
            if (!levelFound){
                System.out.println("Nível de Permissão não Registrado");
            }
        }

    }
}
