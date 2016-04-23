
package ohtu.lyyrakortti;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class KassapaateTest {
    
    Kassapaate kassa;
    Lyyrakortti kortti;
    
    @Before
    public void setUp() {
        kassa = new Kassapaate();
        kortti = mock(Lyyrakortti.class);
    }
    
    @Test
    public void kortiltaVelotetaanHintaJosRahaaOn() {
        kortti.lataa(10);
        when(kortti.getSaldo()).thenReturn(10);
        kassa.ostaLounas(kortti);
       
        verify(kortti, times(1)).getSaldo();
        verify(kortti).osta(eq(Kassapaate.HINTA));
    }
    
    @Test
    public void lataaminenToimiiPositiivisellaMaaralla() {
        kassa.lataa(kortti, 10);
        verify(kortti, times(1)).lataa(10);
    }
    
    @Test
    public void lataaminenEiToimiNegatiivisellaMaaralla() {
        kassa.lataa(kortti, -10);
        verify(kortti, times(0)).lataa(-10);
    }
    
    

    @Test
    public void kortiltaEiVelotetaJosRahaEiRiita() {
        kortti.lataa(4);
        when(kortti.getSaldo()).thenReturn(4);
        kassa.ostaLounas(kortti);
        
        verify(kortti, times(1)).getSaldo();
        verify(kortti, times(0)).osta(anyInt());
    }
}
