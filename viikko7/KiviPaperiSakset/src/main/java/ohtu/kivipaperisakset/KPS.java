package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPS {

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaaVaikea() {
        pelaa(new TietokonePeli(new TekoalyParannettu(200)));
    }

    public void pelaaNormaali() {
        pelaa(new TietokonePeli(new Tekoaly()));
    }

    public void pelaaIhminen() {
        pelaa(new IhmisPeli());
    }

    private static void pelaa(Pelirajapinta peli) {
        System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
        String ekanSiirto = peli.seuraava();
        String tokanSiirto = peli.seuraava();
        pelinToisto(peli, ekanSiirto, tokanSiirto);
    }

    private static void pelinToisto(Pelirajapinta peli, String ekanSiirto, String tokanSiirto) {
        Kirjanpitaja pito = new Kirjanpitaja();
        while (pito.merkitseTulos(ekanSiirto, tokanSiirto)) {
            ekanSiirto = peli.seuraava();
            tokanSiirto = peli.seuraava();
        }
    }

}