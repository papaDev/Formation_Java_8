package fr.openclassroom.streams.reduce;

public enum Couleur {
    MARRON("marron"),
    BLEU("bleu"),
    VERT("vert"),
    VERRON("verron"),
    INCONNU("non déterminé"),
    ROUGE("rouge mais j'avais piscune...");

    private String name = " ";

    Couleur(String n){name = n;}
    public String toString() {return name;}
}
