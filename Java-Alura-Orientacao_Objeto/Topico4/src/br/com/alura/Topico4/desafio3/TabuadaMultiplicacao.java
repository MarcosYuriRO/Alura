package br.com.alura.Topico4.desafio3;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * numero);
        }
    }
}
