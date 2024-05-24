package player_multimediale;

import java.util.Scanner;

public class Audio extends ElementoMultimediale implements Volume {
    private int volume;
    private int durata;

    public Audio(String titolo, int volume, int durata) {
        super(titolo);

    }


    //override di alzavolume e abbassavolume
    @Override
    public void alzaVolume(int alza) {

    }

    @Override
    public void abbassaVolume(int abbassa) {

    }
}
