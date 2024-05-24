package player_multimediale;

import java.util.Scanner;

public class Video extends ElementoMultimediale implements Volume, Luminosità{
    private int luminosità;
    private int durata;
    private int volume;



    //costruttore


    public Video(String titolo, int luminosità, int durata, int volume) {
        super(titolo);
        this.durata= durata;
        this.luminosità = luminosità;
        this.volume = volume;
    }

    @Override
    public void settings(Scanner in) {
        int luminosita;
        int volume;
        System.out.println("Inserire valore luminosita per" + getTitolo());
        luminosita = in.nextInt();
        in.nextLine();
        if (this.luminosità> luminosita)
            abbassaLuminosità(luminosita);
        else
            aumentaLuminosità(luminosita);
        System.out.println("Inserire il valore Volume per " + getTitolo());

        volume = in.nextInt();
        in.nextLine();
        if (this.volume > volume)
            abbassaVolume(volume);
        else
            alzaVolume(volume);

    }


    //metodo plays


    @Override
    public void start() {
        play();
    }


    public void play() {
        String asterischi = "";
        String esclamativo = "";
        String dollari = "";
        String durata = "";
        for (int x = 0; x < this.luminosità; x++) {
            asterischi += "*";
        }
        for (int x = 0; x < this.volume; x++) {
            esclamativo += "!";

        }
        for (int x = 0; x < this.durata; x++) {
            dollari += "$";
        }

        System.out.println(durata + " " + esclamativo + " " + asterischi);

    }


    //Vari override per luminosità e volume

    @Override
    public void aumentaLuminosità(int chiaro) {
        this.luminosità = chiaro;

    }

    @Override
    public void abbassaLuminosità(int scuro) {
        this.luminosità = scuro;
    }

    @Override
    public void alzaVolume(int alza) {
        this.volume = alza;

    }

    @Override
    public void abbassaVolume(int abbassa) {
        this.volume = abbassa;
    }
}



