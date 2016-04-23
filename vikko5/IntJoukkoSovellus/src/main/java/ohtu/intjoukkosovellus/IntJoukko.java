package ohtu.intjoukkosovellus;

import java.util.ArrayList;

public class IntJoukko {
    private ArrayList<Integer> ljono;    
    public IntJoukko() {
        ljono = new ArrayList<Integer>();
    }

    public IntJoukko(ArrayList<Integer> lista) {
        this.ljono = lista;
    }

    public boolean lisaa(int luku) {
        if (ljono.contains(luku)) {
            return false;     }
        ljono.add(luku);
        return true;
    }

    public boolean kuuluu(int luku) {
        return ljono.contains(luku);
    }

    public boolean poista(int luku) {
        int i = 0;
        for (Integer in : ljono) {
            if (ljono.get(i) == luku) {
                ljono.remove(i);
                return true;
            } i++; }
        return false;
    }

    public int mahtavuus() {
        return ljono.size();
    }

    @Override
    public String toString() {
        if (ljono.size() == 0) {
            return "{}";
        } else {
            return ""+ljono;
        }
    }

    public static IntJoukko yhdiste(IntJoukko a, IntJoukko b) {
        ArrayList<Integer> uusi = b.getLista();
        for (int luku : a.getLista()) {
            if (!uusi.contains(luku)) {
                uusi.add(luku);}     }
        return new IntJoukko(uusi);
    }

    public ArrayList<Integer> getLista() {
        return this.ljono;
    }

    public static IntJoukko leikkaus(IntJoukko a, IntJoukko b) {
        ArrayList<Integer> uusi = a.getLista();
        ArrayList<Integer> uusib = new ArrayList<>();
        for (int luku : uusi) {
            if (b.getLista().contains(luku)) {
                uusib.add(luku);         }     }
        return new IntJoukko(uusib);
    }

    public static IntJoukko erotus(IntJoukko a, IntJoukko b) {
        ArrayList<Integer> uusi = a.getLista();
        ArrayList<Integer> uusib = new ArrayList<>();
        for (Integer luku : uusi) {
            if (!b.getLista().contains(luku)) {
                uusib.add(luku);}    }
        return new IntJoukko(uusib);
    }

}
