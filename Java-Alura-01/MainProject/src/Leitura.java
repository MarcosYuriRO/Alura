import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filmeFavorito = leitura.nextLine();
        System.out.println(filmeFavorito);
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação de 0 a 10 para " + filmeFavorito);
        double avaliacao = leitura.nextDouble();
        System.out.println(filmeFavorito + " foi lançado em " + anoDeLancamento);
        System.out.println("Sua avaliação para o filme foi " + avaliacao);
    }
}