public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match.");
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        String sinopse;
        sinopse = """ 
                Filme: Top Gun: Maverick
                Filme de Ação com Tom Cruise.
                Ano de Lançamento:""" + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (notaDoFilme / 2);
        System.out.println(classificacao + " Estrelas");
    }
}