package ohtu;

public class Nollaaja implements Operaatiorajapinta {
    private Sovelluslogiikka sovellus;

    public Nollaaja(Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
    }

    public void operaatio() {
        sovellus.nollaa();
    }
}