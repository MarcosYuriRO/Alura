public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibafichaTec() {
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculeIdade(){
        return 2025 - ano;
    }
}
