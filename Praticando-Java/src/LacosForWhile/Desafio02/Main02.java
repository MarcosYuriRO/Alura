package LacosForWhile.Desafio02;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        int totalValue = 0;

        for (int value : values){
            totalValue += value;
        }
        System.out.println("A soma total das receitas é: " + totalValue);
    }
}
