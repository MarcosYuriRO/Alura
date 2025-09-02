import br.com.alura.Topico4.desafio1.ConversorMoeda;
import br.com.alura.Topico4.desafio2.CalcularSalaRetangular;
import br.com.alura.Topico4.desafio3.TabuadaMultiplicacao;
import br.com.alura.Topico4.desafio4.ConversorTemperaturaPadrao;
import br.com.alura.Topico4.desafio5.Livro;
import br.com.alura.Topico4.desafio5.ProdutoFisico;
import br.com.alura.Topico4.desafio6.Produto;
import br.com.alura.Topico4.desafio6.Servico;

public class Main {
    public static void main(String[] args) {
    //Desafio 1:
        ConversorMoeda conversao = new ConversorMoeda();
        conversao.setValorEmDolar(5);
        conversao.converterDolarParaReal();

    //Desafio 2:
        CalcularSalaRetangular sala1 = new CalcularSalaRetangular();
        sala1.calcularArea(5, 6);
        sala1.calcularPerimetro(5, 6);

    //Desafio 3:
        TabuadaMultiplicacao tabuada1 = new TabuadaMultiplicacao();
        tabuada1.mostrarTabuada(8);

    //Desafio 4:
        ConversorTemperaturaPadrao conversaoTemperatura = new ConversorTemperaturaPadrao();
        conversaoTemperatura.celsiusParaFarenheit(25);
        conversaoTemperatura.farenheitParaCelsius(77);

    //Desafio 5:
        Livro livro1 = new Livro();
        System.out.println("Valor com 15% de desconto: " + livro1.calcularPrecoFinal());

        ProdutoFisico produto1 = new ProdutoFisico();
        System.out.println("Valor com frete de 24,8 reais: " + produto1.calcularPrecoFinal());

    //Desafio 6:
        Servico corteDeCabelo = new Servico();
        corteDeCabelo.setPrecoPadrao(30);
        corteDeCabelo.apliqueDescontos();
        corteDeCabelo.calculePrecoTotal();

        Produto leitescondensados = new Produto();
        leitescondensados.setPrecoPadrao(20);
        leitescondensados.apliqueDescontos();
        leitescondensados.calculePrecoTotal();
    }
}