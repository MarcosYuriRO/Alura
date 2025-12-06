package CondicionaisIfElse.Desafio05;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double purchaseValue = scanner.nextDouble();

        if (purchaseValue >= 100){
            double valueWithDicount = purchaseValue * 0.9;
            System.out.println("Desconto de 10% aplicado!");
            System.out.println("Novo valor: R$ " + valueWithDicount);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$ " + purchaseValue);
        }
    }
}
