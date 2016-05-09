package ohtu.kivipaperisakset;

import java.util.Scanner;

public class TietokonePeli implements Pelirajapinta {

    private static final Scanner scanner = new Scanner(System.in);
    private int luku = 0;
    private TekoalyPinta tekoaly;

    public TietokonePeli(TekoalyPinta tekoaly) {
        this.tekoaly = tekoaly;
    }

    @Override
    public String seuraava() {
        if (luku == 0) {
            luku = 1;
            System.out.print("Ensimmäisen pelaajan siirto: ");
            return scanner.nextLine();
        } else {
            luku = 0;
            String tokaSiirto = tekoaly.annaSiirto();
            System.out.println("Tietokone valitsi: " + tokaSiirto);
            return tokaSiirto;
        }
    }
}
