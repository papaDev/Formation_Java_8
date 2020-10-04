package fr.openclassroom.function.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class TestFunction {

    public static void main(String[] args) {

        List<Personne> lPersonne = Arrays.asList(
                new Personne(10, "toto"),
                new Personne(20, "titi"),
                new Personne(30, "tata"),
                new Personne(40, "tutu")
        );

        Function<Personne, String> f1 = (Personne p) -> p.getNom();
        System.out.println("Affichage de f1 " + f1.toString());
        Function<Personne, Integer> f2 = (Personne p) -> p.getAge() * 2;
        System.out.println(transformToListString(lPersonne, f1));
        System.out.println(transformToListInt(lPersonne, f2));

        // Surcharge de méthode avec "addThen"
        System.out.println("\n Surcharge de méthode avec 'addThen'");
        Function<Personne, String> f3 = (Personne p) -> p.getNom();
        // On ne multplie plus l'age par 2
        Function<Personne, Integer> f4 = (Personne p) -> p.getAge();
        // Nous définissons un traitement supplémentaire sur l'âge
        Function<Integer, Integer> f5 = (Integer a) -> a * 2;
        System.out.println(transformToListString(lPersonne, f3));
        System.out.println(transformToListInt(lPersonne, f4.andThen(f5)));
    }

    public static List<String> transformToListString(List<Personne> list, Function<Personne, String> func) {
        List<String> ls = new ArrayList<>();
        for (Personne p : list) {
            ls.add(func.apply(p));
            // func.apply(p) retournera ici le nom de l'objet Personne
        }
        return ls;
    }

    public static List<Integer> transformToListInt(List<Personne> list, Function<Personne, Integer> func) {
        List<Integer> ls = new ArrayList<>();
        for (Personne p : list) {
            ls.add(func.apply(p));
            // func.apply(p) retournera ici l'âge multiplié par 2 de l'objet Personne
        }
        return ls;
    }
}
