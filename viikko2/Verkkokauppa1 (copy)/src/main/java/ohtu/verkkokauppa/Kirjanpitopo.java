package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 * Created by konstaku on 27.3.2016.
 */
public interface Kirjanpitopo {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
