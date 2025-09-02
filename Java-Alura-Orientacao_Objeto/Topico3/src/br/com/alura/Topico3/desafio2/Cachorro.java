package br.com.alura.Topico3.desafio2;

public class Cachorro extends Animal{
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    public void abanarRabo(){
        System.out.println("O cachorro parece estar feliz, o seu rabo está abanando.");
    }
}
