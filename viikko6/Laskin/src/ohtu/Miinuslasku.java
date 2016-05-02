package ohtu;

public class Miinuslasku implements Operaatiorajapinta {
    private int luku1;
    private Sovelluslogiikka sovellus;

    public Miinuslasku(int luku, Sovelluslogiikka sovellus) {
        this.luku1 = luku;
        this.sovellus = sovellus;
    }

    public void operaatio() {
        sovellus.miinus(luku1);
    }
}