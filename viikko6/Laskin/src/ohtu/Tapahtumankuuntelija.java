package ohtu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class Tapahtumankuuntelija implements ActionListener {
    private JButton plus;
    private JButton miinus;
    private JButton nollaa;
    private JButton undo;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private Sovelluslogiikka sovellus;
    private HashMap<JButton, Operaatiorajapinta> toiminto;
 
    public Tapahtumankuuntelija(JButton plus, JButton miinus, JButton nollaa, JButton undo, JTextField tuloskentta, JTextField syotekentta) {
        this.plus = plus;
        this.miinus = miinus;
        this.nollaa = nollaa;
        this.undo = undo;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.toiminto = new HashMap<>();
        this.sovellus = new Sovelluslogiikka();
    }


    
    @Override
    public void actionPerformed(ActionEvent ae) {
        int arvo = 0;
        try {
            arvo = Integer.parseInt(syotekentta.getText());
        } catch (Exception e) {
        }
        luoToiminnot(arvo);
        toiminto.get(ae.getSource()).operaatio();
        loppuToiminnot();
    }
    
    private void luoToiminnot(int luku) {
        this.toiminto.put(plus, new Pluslasku(luku, sovellus));
        this.toiminto.put(miinus, new Miinuslasku(luku, sovellus));
        this.toiminto.put(nollaa, new Nollaaja(sovellus));
        this.toiminto.put(undo, new Perumiskaveri(sovellus));
    }
    
    private void loppuToiminnot() {
        int laskunTulos = sovellus.tulos();
         
        syotekentta.setText("");
        tuloskentta.setText("" + laskunTulos);
        if ( laskunTulos==0) {
            nollaa.setEnabled(false);
        } else {
            nollaa.setEnabled(true);
        }
        undo.setEnabled(true);
    }


 
}