import java.util.ArrayList;

public class Biblioteka {

    ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    ArrayList<Egzemplarz> egzemplarze = new ArrayList<>();
    ArrayList<Wypozyczenia> wypozyczenie = new ArrayList<>();

    public void dodajKsiazke(Ksiazka ksiazka){
        ksiazki.add(ksiazka);
    }

    public Ksiazka znajdzKsiazke(String tytul){
        for (Ksiazka ksiazka : ksiazki) {
            if(ksiazka.getTytul().equals(tytul)){
                return ksiazka;
            }
        }
        return null;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiAutora(Autor autor) {
        ArrayList<Ksiazka> ksiazkiAutora = new ArrayList<>();
        for (Ksiazka ksiazka : ksiazki) {
            if(ksiazka.getAutor().equals(autor)) {
                ksiazkiAutora.add(ksiazka);
            }
        }
        return ksiazkiAutora;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiPoGatunku(Gatunek gatunek){
        ArrayList<Ksiazka> ksiazkiWGatunku = new ArrayList<>();
        for (Ksiazka ksiazka : ksiazki) {
            if(ksiazka.getGatunek().equals(gatunek)) {
                ksiazkiWGatunku.add(ksiazka);
            }
        }
        return ksiazkiWGatunku;
    }

    public Egzemplarz znajdzEgzemplarzKsiazki(Ksiazka ksiazka){
            for (Egzemplarz egzemplarz : egzemplarze){
                if(egzemplarz.getKsiazka().equals(ksiazka)){
                    return egzemplarz;
                }
            }
        return null;
    }
}
