package LacosForWhile.Desafio07;

import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        boolean isValid = false;

        while(!isValid){
            System.out.print("Digite seu nome: ");
            name = scanner.nextLine();

            if (name.length() >= 3){
                System.out.println("Nome \"" + name + "\" cadastrado com sucesso!");
                isValid = true;
            } else {
                System.out.println("Nome inválido. Digite novamente.");
            }
        }
    }
}
