import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Digite um número inteiro:");
        int valor1 = leitura.nextInt();
        System.out.println("Digite mais um número inteiro:");
        int valor2 = leitura.nextInt();

        int resultado = (valor1 - valor2);

        switch (resultado) {
            case 0:
                System.out.println("Os dois números são iguais.");
                break;

            default:
                if (resultado > 0) {
                    System.out.println(valor1 + " é maior que " + valor2);
                } else {
                    System.out.println(valor1 + " é menor que " + valor2);
                }
                break;
        }
    }
}
