package fr.openclassroom.test1;

public class Lion extends Felin {

    public Lion(){

    }

    public Lion(String coueleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier() {
        System.out.println("Je rugis dans la savane !");
    }
}
