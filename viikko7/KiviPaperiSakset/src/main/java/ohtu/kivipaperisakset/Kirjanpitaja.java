package ohtu.kivipaperisakset;

public class Kirjanpitaja {
    private Tuomari tuomari;

    public Kirjanpitaja() {
        this.tuomari = new Tuomari();
    }

    public boolean merkitseTulos(String eka, String toka) {
        if (onkoOkSiirto(eka) && onkoOkSiirto(toka)){
            tuomari.kirjaaSiirto(eka, toka);
            System.out.println(this.tuomari);
            return true;
        }
        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
        return false;
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
