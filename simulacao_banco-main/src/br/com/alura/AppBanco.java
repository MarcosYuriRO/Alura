package br.com.alura;

import java.math.BigDecimal;

public class AppBanco {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("João");
		Conta conta = new Conta(cliente, new BigDecimal("150"));
		
		OperacaoSaque operacao = new OperacaoSaque(conta, new BigDecimal("150"));
		
		Thread saqueJoao = new Thread(operacao);
		Thread saqueMaria = new Thread(operacao);
		
		saqueJoao.start();
		saqueMaria.start();
		
		System.out.println(Thread.currentThread().getName());
		
		try {
			saqueJoao.join();
			saqueMaria.join();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("Saldo Final: " + (conta.getSaldo()));
		
//		//Saque João
//		operacao.executa();
//		
//		//Saque Maria com mesmo cartão
//		
//		operacao.executa();
		
		
	}
}
