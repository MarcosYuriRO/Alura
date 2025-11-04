package VariaveisETipos.Desafio04;

public class Main04 {
    public static void main(String[] args) {
        int celsius = (int) (Math.random() * 100 + 1);
        System.out.println("Temperatura em graus Celsius: " + celsius);

        double fahrenheits = celsius * 9 / 5 + 32;

        System.out.println("\nE a temperatura em graus Fahrenheit é: " + fahrenheits);
    }
}
