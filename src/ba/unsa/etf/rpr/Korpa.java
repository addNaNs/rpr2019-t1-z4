package ba.unsa.etf.rpr;

public class Korpa {

    private Artikl[] artikli = new Artikl[50];
    private int n = 0;

    public boolean dodajArtikl(Artikl a) {
        if(n<49) {
            artikli[n++] = a;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String s){
        for(int i = 0; i < n; i++){
            if(artikli[i].getKod() == s){
                Artikl a = new Artikl(artikli[i].getNaziv(),artikli[i].getCijena(),artikli[i].getKod());
                for(int j = i; j < n-1; j++){
                    artikli[j] = artikli[j+1];
                }
                n--;
                return a;
            }
        }

        return null;
    }


    public Artikl[] getArtikli() {
        return artikli;
    }

    public int dajUkupnuCijenuArtikala(){
        int s = 0;
        for(int i = 0; i < n; i++){
            s += artikli[i].getCijena();
        }
        return s;
    }


}
