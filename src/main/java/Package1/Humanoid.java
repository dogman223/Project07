package Package1;

public class Humanoid {
    private String imieInazwisko;
    private String plec;
    private String rasa;
    private int wiek;
    private int wzrost;
    private String kolorWlosow;
    private String kolorOczu;

    public Humanoid(String imieInazwisko, String plec, String rasa, int wiek, int wzrost, String kolorWlosow, String kolorOczu) {
        this.imieInazwisko = imieInazwisko;
        this.plec = plec;
        this.rasa = rasa;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.kolorWlosow = kolorWlosow;
        this.kolorOczu = kolorOczu;
    }

    public String getImieInazwisko() {
        return imieInazwisko;
    }

    public void setImieInazwisko(String imieInazwisko) {
        this.imieInazwisko = imieInazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public String getKolorWlosow() {
        return kolorWlosow;
    }

    public void setKolorWlosow(String kolorWlosow) {
        this.kolorWlosow = kolorWlosow;
    }

    public String getKolorOczu() {
        return kolorOczu;
    }

    public void setKolorOczu(String kolorOczu) {
        this.kolorOczu = kolorOczu;
    }

    public static void main(String[] args) {
        Humanoid hominid = new Humanoid("Adam", "mężczyzna", "czlowiek", 24, 180, "blond", "niebieskie");
        Humanoid hominid2 = new Humanoid("Ewa", "kobieta", "czlowiek", 21, 170, "czarne","brązowe");

        System.out.println(" Adam to " + hominid.getRasa() + ".\nEwa ma " + hominid2.getWiek() + " lat. "
                + "Ewa to także " + hominid2.getRasa() + ", ale to " + hominid2.getPlec() + ".");

        }
    }

