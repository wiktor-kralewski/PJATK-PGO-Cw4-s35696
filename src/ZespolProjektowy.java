import java.util.ArrayList;

public class ZespolProjektowy {
    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy = new ArrayList<>();


    public ZespolProjektowy(String nazwaProjektu) {
        this.setNazwaProjektu(nazwaProjektu);
    }

    public String getNazwaProjektu() {
        return nazwaProjektu;
    }

    public void setNazwaProjektu(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
    }

    public ArrayList<Pracownik> getPracownicy() {
        return pracownicy;
    }

    public void setPracownicy(ArrayList<Pracownik> pracownicy) {
        this.pracownicy = pracownicy;
    }


    public void dodajPracownika(Pracownik p){
        pracownicy.add(p);
    }

    public void wypiszSkladZespolu(){
        System.out.println("Skład Zespołu:");
        for(Pracownik p : pracownicy){
            System.out.println(p);
        }
    }


     public double policzLacznyKoszt(){
        double koszt = 0;
        for(Pracownik p : pracownicy){
            koszt += p.obliczKosztMiesieczny();
        }
        return koszt;
    }

    public void znajdzPoId(String idPracownika){
        for(Pracownik p: pracownicy){
            if(idPracownika.equals(p.pobierzIdPracownika())){
                System.out.println("Szukany pracownik po id: " + idPracownika + " został znaleziony: " + p);
            }
        }
    }

    public void wypiszProgramistow(){
        System.out.println("Programiści: ");
        for(Pracownik p : pracownicy){
            if(p instanceof Programista){
                System.out.println(p);
            }
        }
    }


}
