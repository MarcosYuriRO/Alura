package br.com.alura.Topico4.desafio2;

public class CalcularSalaRetangular implements CalculoGeometrico{


    @Override
    public void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("Valor da Área: " + area);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double perimetro = 2 * base + 2 * altura;
        System.out.println("Valor do Perimetro: " + perimetro);
    }
}
