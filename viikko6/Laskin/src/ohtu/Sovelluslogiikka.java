package ohtu;

import java.util.ArrayList;

public class Sovelluslogiikka {
    private int tulos;
    private ArrayList<Integer> tulokset;

    public Sovelluslogiikka() {
        tulokset = new ArrayList<>();
        tulokset.add(0);
    }

    public void plus(int luku) {
        tulos += luku;
        tulokset.add(tulos);
    }

    public void miinus(int luku) {
        tulos -= luku;
        tulokset.add(tulos);
    }

    public void nollaa() {
        tulos = 0;
        tulokset.add(tulos);
    }

    public void undo() {
        tulos = tulokset.get(tulokset.size() - 2);
        tulokset.remove(tulokset.size() - 1);
    }

    public int tulos() {
        return tulos;
    }
}
