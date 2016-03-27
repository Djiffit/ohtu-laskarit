package ohtu.verkkokauppa;

public class Kauppa {

    private Varastopinta varastopinta;
    private Pankkipinta pankkipinta;
    private Ostoskori ostoskori;
    private Viitegeneraattoripinta viitegeneraattoripinta;
    private String kaupanTili;

    public Kauppa(Varastopinta varasto, Pankkipinta pankki, Viitegeneraattoripinta viite) {
        varastopinta = varasto;
        pankkipinta = pankki;
        viitegeneraattoripinta = viite;
        kaupanTili = "33333-44455";
    }

    public void aloitaAsiointi() {
        ostoskori = new Ostoskori();
    }

    public void poistaKorista(int id) {
        Tuote t = varastopinta.haeTuote(id);
        varastopinta.palautaVarastoon(t);
    }

    public void lisaaKoriin(int id) {
        if (varastopinta.saldo(id)>0) {
            Tuote t = varastopinta.haeTuote(id);
            ostoskori.lisaa(t);
            varastopinta.otaVarastosta(t);
        }
    }
    public Pankkipinta getPankki() {
        return pankkipinta;
    }

    public boolean tilimaksu(String nimi, String tiliNumero) {
        int viite = viitegeneraattoripinta.uusi();
        int summa = ostoskori.hinta();
        
        return pankkipinta.tilisiirto(nimi, viite, tiliNumero, kaupanTili, summa);
    }

}
