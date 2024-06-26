package player_multimediale;


import java.util.Scanner;

public class Audio extends ElementoMultimediale implements Volume {
    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);

    }

    //override di alzavolume e abbassavolume e inserimento volume
    @Override
    public void alzaVolume(int alza) {

    }

    @Override
    public void abbassaVolume(int abbassa) {

    }


    @Override
    public void start() {
    }

    @Override
    public void settings(Scanner in) {
        int volume = 0;
        System.out.println("Inserire il valore del volume per" + getTitolo());
        volume = in.nextInt();
        in.nextLine();
        if (this.volume > volume) {
            alzaVolume(volume);

        } else
            abbassaVolume(volume);

    }


    //metodo
    public Audio play() {
        String esclamativo = "";
        String durata = "";
        for (int x = 0; x < this.volume; x++) {
            esclamativo += "!";

        }
        for (int x =  0; x < this.durata; x++) {
            durata += getTitolo();
        }
        System.out.println(durata + " " + esclamativo);


        return null;
    }

}
