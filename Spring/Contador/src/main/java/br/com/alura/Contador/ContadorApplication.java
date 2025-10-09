package br.com.alura.Contador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//Desafio 1:
		/*Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número:");
		int escolha = scanner.nextInt();

		for (int i = 1; i <= escolha; i++) {
			System.out.println(i)
			}
		 */

		//Desafio 2:
		/*System.out.println("Para colocar o Gson pelo Maven, coloque este código em seu .xml:");
		System.out.println("""
				<dependency>
				<groupId>com.google.code.gson</groupId>
				<artifactId>gson</artifactId>
				<version>2.13.2</version>
				</dependency>);
				""");*/

		//Desa


	}
}
