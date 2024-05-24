package player_multimediale;

public class Immagine extends ElementoMultimediale implements Luminosità{
    private int luminosità;


    //costruttore


    public Immagine(String titolo, int luminosità) {
        super(titolo);
        this.luminosità = luminosità;
    }


    //metodo start


    @Override
    public void start() {
        show();
    }


    // metodo  show


    public Immagine show() {
        String asterischi = "";
        for (int x = 0; x < this.luminosità; x++) {
            asterischi += "*";

        }
        System.out.println(getTitolo() + " " + asterischi);
        return null;
    }


    //metodi aumenta luminosità e abbassa luminosità

    @Override
    public void aumentaLuminosità(int chiaro) {
        if (chiaro > this.luminosità) {
            this.luminosità = chiaro;
        } else {
            System.out.println("il valore inserito è negativo");
        }

    }

    @Override
    public void abbassaLuminosità(int scuro) {
        if (scuro < this.luminosità) {
            this.luminosità = scuro;
        } else {
            System.out.println("il valore inserito è positivo");
        }
    }
}
