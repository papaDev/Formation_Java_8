package fr.openclassroom.function.supplier;

public class Personne {

    private int age;
    private String nom;

    public Personne() {
        this.nom = null;
        this.age = 0;
    }

    public Personne(int age, String nom) {
        this.age = age;
        this.nom = nom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String toString() {
        return "#Nom : " + this.getNom() + " - âge : " + this.getAge() + "#";
    }

}
