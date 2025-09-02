package br.com.alura.Topico3.desafio2;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    public void arranharMoveis(){
        System.out.println("O gato está a arranhar o sofá!");
    }
}
