import br.com.alura.Topico5.modelosjogos.JogosIndie;
import br.com.alura.Topico5.modelosjogos.JogosTripleA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem-vindo(a) ao VisualizaJogos!");
        System.out.println("Digite '1' para visualizar jogos indie");
        System.out.println("Digite '2' para visualizar jogos triple A");
        int escolha = leitura.nextInt();
        JogosIndie outerWilds = new JogosIndie();
        JogosTripleA apexLegends = new JogosTripleA();

        switch (escolha){
            case 1:
                outerWilds.setNome("Outer Wilds");
                outerWilds.setAnoDeLancamento(2019);
                outerWilds.setCriador("Masi Oka e Alex Beachum");
                outerWilds.setCrowdfunding(101000);
                outerWilds.exibaInformacoesBasicas();
                outerWilds.avalieJogo(10, 8.3, 6);
                break;
            case 2:
                apexLegends.setNome("Apex Legends");
                apexLegends.setAnoDeLancamento(2019);
                apexLegends.setEmpresa("Respawn");
                apexLegends.setDiretor("Steven Ferreira");
                apexLegends.exibaInformacoesBasicas();
                apexLegends.avalieJogo(4, 8.6, 10);
                break;

            default:
                System.out.println("Escolha inválida!");
                break;
        }
    }
}