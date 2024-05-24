package player_multimediale;


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


    @Override
    public void start() {
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
