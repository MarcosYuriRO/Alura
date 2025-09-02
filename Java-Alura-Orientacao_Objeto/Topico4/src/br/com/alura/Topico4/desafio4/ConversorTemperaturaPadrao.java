package br.com.alura.Topico4.desafio4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFarenheit(int temperaturaCelsius) {
        int farenheit = (int) (temperaturaCelsius * 1.8 + 32);
        System.out.println(farenheit + " Graus Farenheit.");
    }

    @Override
    public void farenheitParaCelsius(int temperaturaFarenheit) {
        int celsius = (int) ((temperaturaFarenheit - 32) * 5/9);
        System.out.println(celsius + " Graus Celsius.");
    }
}
