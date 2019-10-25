package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void DodavanjeIzbacivanje(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "1"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "2"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "3"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "4"));
        korpa.dodajArtikl(new Artikl("Biciklo", 1000, "5"));
        Artikl a = new Artikl("Biciklo", 1000, "1");

        assertEquals(5000, korpa.dajUkupnuCijenuArtikala());
        assertEquals(a.getNaziv(), korpa.izbaciArtiklSaKodom("1").getNaziv());
        assertEquals(4000, korpa.dajUkupnuCijenuArtikala());
    }


}