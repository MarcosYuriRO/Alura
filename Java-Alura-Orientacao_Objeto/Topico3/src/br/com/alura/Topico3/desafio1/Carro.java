package br.com.alura.Topico3.desafio1;

public class Carro {
    private String nome;
    //2023;
    private double precoMedioAno1;
    //2024;
    private double precoMedioAno2;
    //2025;
    private double precoMedioAno3;

    public void informeSobreCarro(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço 2023: " + precoMedioAno1);
        System.out.println("Preço 2024: " + precoMedioAno2);
        System.out.println("Preço 2025: " + precoMedioAno3);
    }

    public void comparePreco(){
        if (precoMedioAno1 > precoMedioAno2){
            if (precoMedioAno1 > precoMedioAno3){
                double menor = precoMedioAno2 > precoMedioAno3 ? 2025 : 2024;
                System.out.println("maior: 2023 e menor: " + menor);
            } else {
                System.out.println("maior: 2025 e menor: 2024");
            }
        } else {
            //precoMedioAno2 > precoMedioAno1;
            if (precoMedioAno2 > precoMedioAno3){
                double menor = precoMedioAno1 > precoMedioAno3 ? 2025 : 2023;
                System.out.println("maior: 2024 e menor: " + menor);
            } else {
                System.out.println("maior: 2025  e menor: 2023");
            }
        }
    }

    //getter e setters;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoMedioAno1() {
        return precoMedioAno1;
    }

    public void setPrecoMedioAno1(double precoMedioAno1) {
        this.precoMedioAno1 = precoMedioAno1;
    }

    public double getPrecoMedioAno2() {
        return precoMedioAno2;
    }

    public void setPrecoMedioAno2(double precoMedioAno2) {
        this.precoMedioAno2 = precoMedioAno2;
    }

    public double getPrecoMedioAno3() {
        return precoMedioAno3;
    }

    public void setPrecoMedioAno3(double precoMedioAno3) {
        this.precoMedioAno3 = precoMedioAno3;
    }
}