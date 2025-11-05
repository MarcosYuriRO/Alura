package VariaveisETipos.Desafio10;

public class Main10 {
    public static void main(String[] args) {
        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double combustivelAtual = 20;
        double distanciaViagem = 200;

        double distanciaMaxima = consumoMedio * capacidadeTanque;
        double distanciaPossivel = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo: %.2f km.", distanciaMaxima);
        System.out.printf("\nAutonomia atual: %.2f km.", distanciaPossivel);

        if (distanciaPossivel >= distanciaViagem){
            System.out.println("\nVocê conseguirá completar a viagem sem precisar abastecer. ");
        } else {
            System.out.println("\nPara concluir a viagem, você deverá abastecer.");
        }
    }
}
