public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;


    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.setCzyAutomatyzujacy(czyAutomatyzujacy);
        this.setLiczbaScenariuszy(liczbaScenariuszy);
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public void setCzyAutomatyzujacy(boolean czyAutomatyzujacy) {
        this.czyAutomatyzujacy = czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    public void setLiczbaScenariuszy(int liczbaScenariuszy) {
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double koszt = super.obliczKosztMiesieczny();
        koszt = koszt + liczbaScenariuszy * 50;
        return koszt;
    }

    @Override
    public String przedstawSie() {
        return super.przedstawSie() + " jestem Testerem/rką, moja liczba scenariuszy to: " + liczbaScenariuszy;
    }
}
