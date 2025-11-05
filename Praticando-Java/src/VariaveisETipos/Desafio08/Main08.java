package VariaveisETipos.Desafio08;

public class Main08 {
    public static void main(String[] args) {
        double valueReais = 451.5;
        double dollarQuote = 5.25;
        double valueDollars = valueReais / dollarQuote;

        System.out.printf("O valor em dólares é: U$ %.2f", valueDollars);
    }
}
