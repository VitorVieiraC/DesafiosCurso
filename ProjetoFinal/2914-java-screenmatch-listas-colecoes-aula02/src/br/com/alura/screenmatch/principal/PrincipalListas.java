package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);
        Filme favorito = new Filme("Matrix",1999);
        favorito.avalia(10);
        Filme outro = new Filme("John Wick",2014);
        outro.avalia(8.5);
        Serie serie = new Serie("The last of us",2023);
        ArrayList<Titulo> Lista = new ArrayList<>();
        Lista.add(filmeDoPaulo);
        filmeDoPaulo.avalia(10);
        Lista.add(meuFilme);
        meuFilme.avalia(6);
        Lista.add(outroFilme);
        outroFilme.avalia(9);
        Lista.add(lost);
       Lista.add(favorito);
       Lista.add(outro);
       Lista.add(serie);
       for(Titulo item:Lista){
           System.out.println(item);
           if (item instanceof Filme filme){
               System.out.println("Classificação: "+filme.getClassificacao());
           }
       }
    ArrayList<String> buscarArtista = new ArrayList<>();
       buscarArtista.add("Leonado Di Caprio");
       buscarArtista.add(" Vincent van Gogh");
       buscarArtista.add(" Pablo Picasso. ");
       buscarArtista.add("Leonardo da Vinci");
        System.out.println("Artistas antes da ordenação: "+buscarArtista);
        Collections.sort(buscarArtista);
        System.out.println("Lista depois da ordenação: ");
        System.out.println(buscarArtista);
        Collections.sort(Lista);
        System.out.println("Lista ordenada!!!");
        System.out.println(Lista);
        Lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordernar po ano");
        System.out.println(Lista);
    }
}
