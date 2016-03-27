package ohtu.verkkokauppa;

/**
 * Created by konstaku on 27.3.2016.
 */
public interface Pankkipinta {
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
    public Kirjanpitopo getKirjanpito();
}
