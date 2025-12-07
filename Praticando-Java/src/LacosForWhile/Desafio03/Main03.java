package LacosForWhile.Desafio03;

public class Main03 {
    public static void main(String[] args) {
        int totalSum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                totalSum += i;
            }
        }
        System.out.println("A soma total dos números pares de 1 a 100 é: " + totalSum);
    }
}
