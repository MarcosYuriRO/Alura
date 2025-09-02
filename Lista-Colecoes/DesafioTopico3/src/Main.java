public class Main {
    public static void main(String[] args) {
        //Desafio 1:
        /*ArrayList<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        lista.add("c");

        for (String item : lista){
            System.out.println(item);
        }*/


        //Desafio 2/3 (Casting):
        /*Cachorro rex = new Cachorro();
        //Animal animalUm = (Animal) rex;
        if(rex instanceof Animal animalUm) {
            //
        }*/


        //Desafio 4:
        /*Produto produto1 = new Produto();
        produto1.setNome("Touca");
        produto1.setPreco(40);
        Produto produto2 = new Produto();
        produto2.setNome("Refrigerante");
        produto2.setPreco(8.5);
        Produto produto3 = new Produto();
        produto3.setNome("Casaco");
        produto3.setPreco(130);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        double contador = 0;

        for(Produto produto : listaProdutos) {
            somaPrecos += produto.getPreco();
            contador++;
       }
        double mediaPrecos = somaPrecos / contador;
        System.out.println(mediaPrecos);*/


       //Desafio 5:
        /*Circulo circulo1 = new Circulo();
        circulo1.setRaio(3);
        System.out.println(circulo1.calcularArea());

        Quadrado quadrado1 = new Quadrado();
        quadrado1.setLado(6);
        System.out.println(quadrado1.calcularArea());*/


        //Desafio 6:
        /*ContaBancaria  conta1 = new ContaBancaria();
        conta1.setNumeroConta(1);
        conta1.setSaldo(300);
        ContaBancaria  conta2 = new ContaBancaria();
        conta2.setNumeroConta(2);
        conta2.setSaldo(40);
        ContaBancaria  conta3 = new ContaBancaria();
        conta3.setNumeroConta(3);
        conta3.setSaldo(2100);
        ContaBancaria  conta4 = new ContaBancaria();
        conta4.setNumeroConta(4);
        conta4.setSaldo(700);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        listaContas.add(conta4);

        double saldoParametro = 0;
        int contador = -2;

        for (ContaBancaria conta : listaContas){
            contador++;
            saldoParametro -= conta.getSaldo();
            if(saldoParametro > conta.getSaldo()) {
                saldoParametro = listaContas.get(contador).getSaldo();
            } else {
                saldoParametro = conta.getSaldo();
            }
        }
        System.out.println(saldoParametro);*/

    }
}