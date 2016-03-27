package ohtu.verkkokauppa;

/**
 * Created by konstaku on 27.3.2016.
 */
public interface Varastopinta {
    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);
}
