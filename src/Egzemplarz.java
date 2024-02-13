public class Egzemplarz {
    private Ksiazka ksiazka;

    public enum  Stan{
        WYPOZYCZONY,WOLNY
    }
    private Stan stan;
    public Egzemplarz(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Ksiazka getKsiazka() {
        return ksiazka;
    }

    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }

    public Egzemplarz(Stan stan) {
        this.stan = stan;
    }

    public Stan getStan() {
        return stan;
    }

    public void setStan(Stan stan) {
        this.stan = stan;
    }
}
