package ohtu;

public class Pluslasku implements Operaatiorajapinta {
    private int luku1;
    private Sovelluslogiikka sovellus;

    public Pluslasku(int luku, Sovelluslogiikka sovellus) {
        this.luku1 = luku;
        this.sovellus = sovellus;
    }

    public void operaatio() {
        sovellus.plus(luku1);
    }
}