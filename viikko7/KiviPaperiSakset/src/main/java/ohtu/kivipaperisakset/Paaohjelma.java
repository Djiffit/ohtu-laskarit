package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            ohjeidenTulostus();

            String vastaus = scanner.nextLine();
            if (vastaus.endsWith("a")) {
                KPSPelinrakentaja.pelaajaVsPelaaja();
            } else if (vastaus.endsWith("b")) {
                KPSPelinrakentaja.pelaajaVsTekoalyNorm();
            } else if (vastaus.endsWith("c")) {
                KPSPelinrakentaja.pelaajaVsTekoalyPlus();
            } else {
                break;
            }

        }

    }

    private static void ohjeidenTulostus() {
        System.out.println("\nValitse pelataanko"
                + "\n (a) ihmistä vastaan "
                + "\n (b) tekoälyä vastaan"
                + "\n (c) parannettua tekoälyä vastaan"
                + "\nmuilla valinnoilla lopetataan");
    }
}
