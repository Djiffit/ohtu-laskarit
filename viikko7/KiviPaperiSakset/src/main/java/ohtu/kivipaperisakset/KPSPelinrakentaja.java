package ohtu.kivipaperisakset;

public class KPSPelinrakentaja {
    public static void pelaajaVsPelaaja() {
        new KPS().pelaaIhminen();
    }
    public static void pelaajaVsTekoalyNorm() {
        new KPS().pelaaNormaali();
    }
    public static void pelaajaVsTekoalyPlus() {
        new KPS().pelaaVaikea();
    }
}
