package fr.openclassroom.test2;

public class ClassPrincipal {

    public static void main(String[] args){
        Dialoguer d = (s) -> System.out.println("Tu as dis " + s);
        d.parler("Bonjour");


    }
}
