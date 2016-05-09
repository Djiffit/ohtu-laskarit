package ohtu.kivipaperisakset;

import java.util.Scanner;

public class IhmisPeli implements Pelirajapinta {

    private static final Scanner scanner = new Scanner(System.in);
    private int kenenVuoro = 0;

    public String seuraava() {
        if (kenenVuoro == 0) {
            kenenVuoro = 1;
            System.out.print("Ensimmäisen pelaajan siirto: ");
        } else {
            kenenVuoro = 0;
            System.out.print("Toisen pelaajan siirto: ");
        }
        return scanner.nextLine();
    }
}
