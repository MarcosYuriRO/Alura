package StringsRegex.Desafio03;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String fileName = scanner.nextLine();

        // \\..+$: \\. é a string com qualquer caractere. 
        // O ponto depois, significa que ele pegará a parte da string a partir de o ponto (.), até o resto final da string ($).
        // + pega um ou mais caracteres antes do final da string.
        // * pega 0 ou mais caracteres antes do final da string.
        System.out.println("Nome do arquivo sem extensão: " + fileName.replaceAll("\\..+$", ""));
        
    }
}
