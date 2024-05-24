package player_multimediale;

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

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public abstract void start();

}