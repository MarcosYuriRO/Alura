public class ConversaoDolarReal {
    public static void main(String[] args) {
        int valorEmDolares = 8;
        double conversaoParaReais = 4.94;
        double valorEmReais = valorEmDolares * conversaoParaReais;
        System.out.println(String.format("%d dolares, em reais, equivalem a %.2f reais.", valorEmDolares, valorEmReais));
        //System.out.println(valorEmDolares + " dolares, em reais, equivalem a " + valorEmReais + " reais.");
    }
}
