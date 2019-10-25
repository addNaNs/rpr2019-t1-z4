package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void DodavanjeIzbacivanje(){
        Supermarket korpa = new Supermarket();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "5"));

        assertEquals(1000, korpa.getArtikli()[0].getCijena());
        assertEquals("Biciklo", korpa.izbaciArtiklSaKodom("1").getNaziv());
        assertEquals("2", korpa.izbaciArtiklSaKodom("2").getKod());
        assertNull(korpa.izbaciArtiklSaKodom("2"));
    }

}