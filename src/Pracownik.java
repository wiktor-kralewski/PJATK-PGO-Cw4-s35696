import java.util.ArrayList;
import java.util.Objects;

public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;


    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.setIdPracownika(idPracownika);
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setStawkaBazowa(stawkaBazowa);
    }

    public String getIdPracownika() {
        return idPracownika;
    }

    public void setIdPracownika(String idPracownika) {
        this.idPracownika = idPracownika;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getStawkaBazowa() {
        return stawkaBazowa;
    }

    public void setStawkaBazowa(double stawkaBazowa) {
        this.stawkaBazowa = stawkaBazowa;
    }

    public final String pobierzIdPracownika(){
        return getIdPracownika();
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "idPracownika='" + idPracownika + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stawkaBazowa=" + stawkaBazowa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik pracownik = (Pracownik) o;
        return Objects.equals(idPracownika, pracownik.idPracownika);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idPracownika);
    }

    public double obliczKosztMiesieczny(){
        return getStawkaBazowa();
    }

    public String przedstawSie(){
        return "Cześć jestem " + imie + " " + nazwisko;
    }


}
