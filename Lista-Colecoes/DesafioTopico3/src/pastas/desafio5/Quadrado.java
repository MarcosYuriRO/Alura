package pastas.desafio5;

public class Quadrado implements Forma {
    private double lado;

    @Override
    public double calcularArea() {
        double areaQuadrado = lado * lado;
        return areaQuadrado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
