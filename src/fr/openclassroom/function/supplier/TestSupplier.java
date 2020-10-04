package fr.openclassroom.function.supplier;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {
        Supplier<String> s1 = () -> new String("Hello !");
        System.out.println(s1.get());
        Supplier<Personne> s2 = () -> new Personne(50, "Dédé");
        System.out.println(s2.get());
    }
}
