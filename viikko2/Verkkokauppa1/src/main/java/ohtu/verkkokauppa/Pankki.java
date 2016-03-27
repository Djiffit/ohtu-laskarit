package ohtu.verkkokauppa;

public class Pankki implements Pankkipinta {

    private Kirjanpitopo kirjanpitopo;

    public Pankki(Kirjanpitopo po) {
        kirjanpitopo = po;
    }

    public Kirjanpitopo getKirjanpito() {
        return kirjanpitopo;
    }

    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpitopo.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");

        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
