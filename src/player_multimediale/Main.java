package player_multimediale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String titolo;
        int volumeIniziale = 8;
        int luminositàIniziale = 5;
        int durata;
        int tipologia;

        System.out.println("INSERIRE 5 FILE MULTIMEDIALI:");
        Scanner in = new Scanner(System.in);
        ElementoMultimediale[] multi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            boolean var1 = true;

            while (var1) {
                System.out.println("Che tipologia di file multimediale vuoi inserire? ('1' per Immagine '2' per Audio '3' per Video)");
                System.out.println("Hai inserito " + i + " elementi multimediali.");
                tipologia = in.nextInt();
                in.nextLine();
                switch (tipologia) {
                    case 1:
                        System.out.println("Inserire titolo immagine.");
                        titolo = in.nextLine();
                        multi[i] = new Immagine(titolo, luminositàIniziale);
                        var1 = false;
                        break;
                    case 2:
                        System.out.println("Inserire titolo Audio. ");
                        titolo = in.nextLine();
                        System.out.println("Inserire durata Audio " + titolo + ".");
                        durata = in.nextInt();
                        in.nextLine();
                        multi[i] = new Audio(titolo, durata, volumeIniziale);
                        var1 = false;
                        break;
                    case 3:
                        System.out.println("Inserire titolo Video. ");
                        titolo = in.nextLine();
                        System.out.println("Inserire durata Video " + titolo + ".");
                        durata = in.nextInt();
                        in.nextLine();
                        multi[i] = new Video(titolo, luminositàIniziale, volumeIniziale, durata);
                        var1 = false;
                        break;
                    default:
                        System.out.println("Selezione errata! ");
                        break;
                }
            }
        }

        while (true) {
            System.out.println("Scegli un elemento multimediale dal numero 1 al 5. Inserisci il numero 0 per uscire");
            System.out.println("-----------------------------------------");
            System.out.println(" MENU:   ");

            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ") " + multi[i].getTitolo());
            }

            System.out.println("-----------------------------------------");
            System.out.println("Quale elemento vuoi riprodurre?");

            int scelta = in.nextInt();
            in.nextLine();
            if (scelta == 0) {
                System.out.println("Exit");
                break;
            }

            if (scelta > 0 && scelta <= 5) {
                multi[scelta - 1].start();

                System.out.println("Eseguito!! Vuoi modificare qualcosa del file multimediale? [Y/N]");
                String choice = in.nextLine();
                if (choice.equalsIgnoreCase("Y")) {
                    multi[scelta - 1].settings(in);
                }
            } else {
                System.out.println("Selezione errata!");
            }
        }
        in.close();
    }
}
