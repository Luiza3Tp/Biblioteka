import java.util.ArrayList;

public class Biblioteka {

    ArrayList<Ksiazka> ksiazki = new ArrayList<>();
    ArrayList<Egzemplarz> egzemplarze = new ArrayList<>();
    ArrayList<Wypozyczenia> wypozyczenie = new ArrayList<>();

    public void dodajKsiazke(){
    }

    public  Ksiazka znajdzKsiazke(String tytul){
        for (Ksiazka ksiazka : ksiazki) {
            if(ksiazka.getTytul().equals(tytul)){
                return ksiazka;
            }
        }
        return null;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiAutora(Autor autor) {
        for (Ksiazka ksiazka : ksiazki) {
            if(ksiazka.getAutor().equals(autor)) {
                return

            }
        }
        return null;
    }

    public ArrayList<Ksiazka> znajdzKsiazkiPoGatunku(Gatunek gatunek){
        for (Ksiazka ksiazka : ksiazki) {
            if(ksiazka.getGatunek().equals(gatunek)) {
                return ;

            }
        }
        return null;
    }

    public Egzemplarz znajdzEgzemplarzKsiazki(Ksiazka ksiazka){
        for (Ksiazka ksiazka : ksiazki) {
            if(ksiazka.get().equals(ksiazka)) {
                return ;

            }
        }
        return null;
    }
}
