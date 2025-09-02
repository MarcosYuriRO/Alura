package pastas.desafio5;

public class Circulo implements  Forma {
    private double raio;

    @Override
    public double calcularArea() {
        double areaCirculo = 3.14 * (getRaio() * getRaio());
        return areaCirculo;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
