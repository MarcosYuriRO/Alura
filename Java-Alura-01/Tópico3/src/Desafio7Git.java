import java.util.Scanner;

public class Desafio7Git {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        String tentativa = "";
        String senha = "java123";

        System.out.println("Tente acertar a senha:");
        tentativa = leitura.nextLine();

        while (!tentativa.equals(senha)) {
            System.out.println("Tente novamente");
            tentativa = leitura.nextLine();
            
            if (tentativa.equals(senha)) {
                System.out.println("Parabéns! Você acertou a senha.");
            }
        }

    }
}
