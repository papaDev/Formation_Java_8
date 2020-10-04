package fr.openclassroom.function.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        Consumer<Integer> print = x -> System.out.print(x + 13 +"#,");

        List<Personne> lPersonne = Arrays.asList(
                new Personne(10, "toto"),
                new Personne(20, "titi"),
                new Personne(30, "tata"),
                new Personne(40, "tutu")
        );

        System.out.print("[");
        for (int i = 0; i < lPersonne.size(); i++) {
            System.out.print("#Nom : " + lPersonne.get(i).getNom() + " - âge : " + lPersonne.get(i).getAge() + "#,");
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < lPersonne.size(); i++) {
            System.out.print("#Nom : " + lPersonne.get(i).getNom() + " - âge : ");
            print.accept(lPersonne.get(i).getAge());

        }
        System.out.println("]");

    }

}
