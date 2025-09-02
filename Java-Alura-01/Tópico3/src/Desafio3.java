import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        System.out.println("Bem-vindo ao Java Calcula! Escolha uma das opções abaixo:");
        System.out.println("Opção 1: Calcular a área de um quadrado.");
        System.out.println("Opção 2: Calcular a área de um círculo.");
        int opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Defina os lados do quadrado:");
                double lados = leitura.nextDouble();
                double areaQuadrado = (lados * lados);
                System.out.println(String.format("Um quadrado com %f de lado, tem uma área de %f!", lados, areaQuadrado));
                break;
            case 2:
                System.out.println("Defina o raio do círculo:");
                double raio = leitura.nextDouble();
                double areaCirculo = (3.14 * (raio * raio));
                System.out.println(String.format("Um circulo com %f de raio, apresenta uma área de %f! (pi = 3,14)", raio, areaCirculo));
                break;
            default:
                System.out.println("Opção inválida!!");
                break;
        }
    }
}