package fr.openclassroom.streams.filtrage;

import fr.openclassroom.streams.numun.Couleur;
import fr.openclassroom.streams.numun.Personne;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamFiltrage {

    public static void main(String[] args) {
        List<fr.openclassroom.streams.numun.Personne> listP = Arrays.asList(
                new fr.openclassroom.streams.numun.Personne(1.80, 70, "A", "Nicolas", fr.openclassroom.streams.numun.Couleur.BLEU),
                new fr.openclassroom.streams.numun.Personne(1.56, 50, "B", "Nicole", fr.openclassroom.streams.numun.Couleur.VERRON),
                new fr.openclassroom.streams.numun.Personne(1.75, 65, "C", "Germain", fr.openclassroom.streams.numun.Couleur.VERT),
                new fr.openclassroom.streams.numun.Personne(1.68, 50, "D", "Michel", fr.openclassroom.streams.numun.Couleur.ROUGE),
                new fr.openclassroom.streams.numun.Personne(1.96, 65, "E", "Cyrille", fr.openclassroom.streams.numun.Couleur.BLEU),
                new fr.openclassroom.streams.numun.Personne(2.10, 120, "F", "Denis", fr.openclassroom.streams.numun.Couleur.ROUGE),
                new fr.openclassroom.streams.numun.Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nAprès le filtre");
        sp = listP.stream();
        sp.filter(x -> x.getPoids() > 50).forEach(System.out::println);

    }
}
