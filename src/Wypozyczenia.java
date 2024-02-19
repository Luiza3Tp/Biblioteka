import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;


public class Wypozyczenia {
    private static final int DLUGOSC=30;
    private  static double STAWKA= 0.1;
    private Egzemplarz egzemplarz;
    private LocalDate dataWyporzyczenia;
    private LocalDate dataOddania;
    private LocalDate planowanaDataOddania;

    public Wypozyczenia(Egzemplarz egzemplarz){
        this.egzemplarz=egzemplarz;
        dataWyporzyczenia=LocalDate.now();
        planowanaDataOddania=dataWyporzyczenia.plusDays(DLUGOSC);
        egzemplarz.setStan(Egzemplarz.Stan.WYPOZYCZONY);
    }
    public double oddaj(){
        dataOddania = LocalDate.now();
        egzemplarz.setStan(Egzemplarz.Stan.WOLNY);
        if (dataOddania.isAfter(planowanaDataOddania)){
            int dni = (int) DAYS.between(dataOddania,dataWyporzyczenia);
            return dni*STAWKA;
        }
        return 0;
    }
}
