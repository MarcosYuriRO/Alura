package br.com.alura.Topico3.desafio3;

public class ContaBancaria {
    protected double saldo;

    public void depositar(double valorDeposito){
        saldo+= valorDeposito;
        System.out.println("Depósito Realizado.");
    }

    public void sacar(double valorSaque){
        if(valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Saque Realizado.");
        } else {
            System.out.println("Erro no Saque.");
        }
    }

    public void verificarSaldo(){
        System.out.println("Saldo: " + saldo);
    }


}
