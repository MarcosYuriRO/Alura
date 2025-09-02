public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 50.00;
        double percentualDesconto = 10;
        double valorDesconto = precoOriginal * percentualDesconto / 100;
        double montante = precoOriginal - valorDesconto;
        System.out.println("Valor a ser pago: " + montante + " reais.");
    }
}
