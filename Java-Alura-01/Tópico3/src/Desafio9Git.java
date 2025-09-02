import java.util.Scanner;

public class Desafio9Git {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        int quantiaMinutos = 1;

        while (quantiaMinutos != 0) {
            System.out.println("Informe uma quantia de minutos:");
            quantiaMinutos = leitura.nextInt();
            double horas = quantiaMinutos / 60;
            System.out.println(horas + " Horas.");
        }
    }
}
