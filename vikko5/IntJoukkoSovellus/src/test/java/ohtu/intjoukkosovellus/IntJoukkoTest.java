package ohtu.intjoukkosovellus;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IntJoukkoTest {

    IntJoukko joukko;

    @Before
    public void setUp() {
        joukko = new IntJoukko();
        joukko.lisaa(10);
        joukko.lisaa(3);
    }

    @Test
    public void lukujaLisattyMaara() {
        joukko.lisaa(4);
        assertEquals(3, joukko.mahtavuus());
    }

    @Test
    public void samaLukuMeneeJoukkoonVaanKerran() {
        joukko.lisaa(10);
        joukko.lisaa(3);
        assertEquals(2, joukko.mahtavuus());
    }

    @Test
    public void vainLisatytLuvutLoytyvat() {
        assertTrue(joukko.kuuluu(10));
        assertFalse(joukko.kuuluu(5));
        assertTrue(joukko.kuuluu(3));
    }

    @Test
    public void poistettuEiOleEnaaJoukossa() {
        joukko.poista(3);
        assertFalse(joukko.kuuluu(3));
        assertEquals(1, joukko.mahtavuus());
    }

    @Test
    public void toimiiKasvatuksenJalkeen() {
        int[] lisattavat = {1, 2, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14};
        for (int luku : lisattavat) {
            joukko.lisaa(luku);
        }
        assertEquals(14, joukko.mahtavuus());
        assertTrue(joukko.kuuluu(11));
        joukko.poista(11);
        assertFalse(joukko.kuuluu(11));
        assertEquals(13, joukko.mahtavuus());
    }

    @Test
    public void voiLuodaArrayListilla() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        IntJoukko joukko = new IntJoukko(lista);
        assertEquals(joukko.mahtavuus(), 1);
        assertEquals(joukko.toString(), "[1]");
    }

    @Test
    public void yhdisteToimii() {
        IntJoukko lol = new IntJoukko();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        ArrayList<Integer> listaa = new ArrayList<Integer>();
        lista.add(2);
        IntJoukko joukko = new IntJoukko(lista);
        IntJoukko jengi = lol.yhdiste(joukko, new IntJoukko(listaa));
        assertEquals(jengi.toString(), "[1, 2]");
        assertEquals(jengi.mahtavuus(), 2);
    }

    @Test
    public void leikkausToimii() {
        IntJoukko lol = new IntJoukko();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        ArrayList<Integer> listaa = new ArrayList<Integer>();
        listaa.add(2);
        listaa.add(3);
        IntJoukko joukko = new IntJoukko(lista);
        IntJoukko jengi = lol.leikkaus(joukko, new IntJoukko(listaa));
        assertEquals(jengi.mahtavuus(), 1);
        assertEquals(jengi.toString(), "[2]");
    }
    
       @Test
    public void erotusToimii() {
        IntJoukko lol = new IntJoukko();
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        ArrayList<Integer> listaa = new ArrayList<Integer>();
        listaa.add(2);
        IntJoukko joukko = new IntJoukko(lista);
        IntJoukko jengi = lol.erotus(joukko, new IntJoukko(listaa));
        assertEquals(jengi.mahtavuus(), 1);
        assertEquals(jengi.toString(), "[1]");
    }

    @Test
    public void toStringToimii() {
        assertEquals("[10, 3]", joukko.toString());
    }

    @Test
    public void toStringToimiiYhdenKokoiselleJoukolla() {
        joukko = new IntJoukko();
        joukko.lisaa(1);
        assertEquals("[1]", joukko.toString());
    }

    @Test
    public void toStringToimiiTyhjallaJoukolla() {
        joukko = new IntJoukko();
        assertEquals("{}", joukko.toString());
    }
}
