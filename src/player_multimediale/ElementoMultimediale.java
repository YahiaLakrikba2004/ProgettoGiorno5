package player_multimediale;

import java.util.Scanner;

public abstract class ElementoMultimediale {

    private String titolo;

    // creazione Costruttore

    public ElementoMultimediale(String titolo) {

        this.titolo = titolo;
    }

    // implementazione di Getters and Setters
    public String getTitolo() {
        return titolo;
    }
    public abstract void start();

    public abstract void settings(Scanner in);
}









