package VariaveisETipos.Desafio06;

public class Main06 {
    public static void main(String[] args) {
        double value = 499.99;
        String categoriaProduto;

        if (value <= 50){
            categoriaProduto = "Econômico";
        } else if (value <= 200){
            categoriaProduto = "Intermediário";
        } else {
            categoriaProduto = "Premium";
        }
        System.out.println("Categoria do Produto: " + categoriaProduto);
    }
}
