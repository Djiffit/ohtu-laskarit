package ohtu;

public class Perumiskaveri implements Operaatiorajapinta {
    private Sovelluslogiikka sovellus;

    public Perumiskaveri(Sovelluslogiikka sovellus) {
        this.sovellus = sovellus;
    }

    public void operaatio() {
        sovellus.undo();
    }
}