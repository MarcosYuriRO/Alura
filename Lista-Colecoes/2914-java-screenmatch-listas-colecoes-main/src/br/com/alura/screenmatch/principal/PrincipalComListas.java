package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
                //Cada item/Título que está dentro da lista...
            System.out.println(item.getNome());
                //exibirá o nome de cada filme na ordem que foram adicionados, até acabar a lista;

            if(item instanceof Filme filme) {
                //Se item instancia de Filme, o coloca dentro da variável filme;
                System.out.println(filme.getClassificacao());
            }
        }

        System.out.println("Lista de Títulos em ordem Alfabética:");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordem de Data de Lançamento:");
        System.out.println(lista);

    }
}