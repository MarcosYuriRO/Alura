import br.com.alura.Topico3.desafio1.Carro;
import br.com.alura.Topico3.desafio2.Cachorro;
import br.com.alura.Topico3.desafio2.Gato;
import br.com.alura.Topico3.desafio3.ContaCorrente;

public class Main {
    public static void main(String[] args) {
    //Desafio 1:
        Carro analisarCarro1 = new Carro();
        analisarCarro1.setNome("Kwid");
        analisarCarro1.setPrecoMedioAno1(12000);
        analisarCarro1.setPrecoMedioAno2(15000);
        analisarCarro1.setPrecoMedioAno3(10000);

        analisarCarro1.informeSobreCarro();
        analisarCarro1.comparePreco();

        //Desafio 2:
        Gato gato1 = new Gato();
        gato1.emitirSom();
        gato1.arranharMoveis();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();

        //Desafio 3:
        ContaCorrente conta1 = new ContaCorrente();
        conta1.verificarSaldo();
        conta1.depositar(800);
        conta1.verificarSaldo();
        conta1.sacar(300);
        conta1.verificarSaldo();
        conta1.cobrarTaxaMensal();
        conta1.verificarSaldo();

        //Desafio 4:

    }
}