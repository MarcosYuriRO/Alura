package br.com.alura.Topico4.desafio1;

public class ConversorMoeda implements ConversaoFinanceira {
    private double valorEmDolar;
    private double valorEmReal;

    @Override
    public void converterDolarParaReal() {
        valorEmReal = valorEmDolar * 5.43;
        System.out.println(String.format("%.2f dólares, equivalem a %.2f reais.", valorEmDolar, valorEmReal));
    }

    //getter e setter:
        public double getValorEmDolar() {
            return valorEmDolar;
        }

        public void setValorEmDolar(double valorEmDolar) {
            this.valorEmDolar = valorEmDolar;
    }
}
