public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;


    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.setGlownyJezyk(glownyJezyk);
        this.setLiczbaRepozytoriow(liczbaRepozytoriow);
    }

    public String getGlownyJezyk() {
        return glownyJezyk;
    }

    public void setGlownyJezyk(String glownyJezyk) {
        this.glownyJezyk = glownyJezyk;
    }

    public int getLiczbaRepozytoriow() {
        return liczbaRepozytoriow;
    }

    public void setLiczbaRepozytoriow(int liczbaRepozytoriow) {
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double koszt = super.obliczKosztMiesieczny();
        koszt = koszt + 0.1 * koszt * liczbaRepozytoriow;
        return koszt;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " jestem Programistą/tką, specjalizuję się w jęzuku " + glownyJezyk + " oraz pracuję nad taką liczbą repozytoriów: " + liczbaRepozytoriow;
    }

}
