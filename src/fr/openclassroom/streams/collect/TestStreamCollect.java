package fr.openclassroom.streams.collect;

import fr.openclassroom.streams.numun.Couleur;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamCollect {

    public static void main(String[] args) {
        List<Personne> listP = Arrays.asList(
                new Personne(1.80, 70, "A", "Nicolas", Couleur.BLEU),
                new Personne(1.56, 50, "B", "Nicole", Couleur.VERRON),
                new Personne(1.75, 65, "C", "Germain", Couleur.VERT),
                new Personne(1.68, 50, "D", "Michel", Couleur.ROUGE),
                new Personne(1.96, 65, "E", "Cyrille", Couleur.BLEU),
                new Personne(2.10, 120, "F", "Denis", Couleur.ROUGE),
                new Personne(1.90, 90, "G", "Olivier", Couleur.VERRON)
        );

        Stream<Personne> sp = listP.stream();
        sp.forEach(System.out::println);

        System.out.println("\nUtilisation de Collect");
        sp = listP.stream();

        List<Double> ld = sp    .filter(x -> x.getPoids() > 50)
                                .map(x -> x.getPoids())
                                .collect(Collectors.toList());
        System.out.println(ld);

        sp = listP.stream();
        Optional<Personne> td = sp    .filter(x -> x.getPoids() > 50)
                                       .findFirst();
        System.out.println(td);

    }
}
