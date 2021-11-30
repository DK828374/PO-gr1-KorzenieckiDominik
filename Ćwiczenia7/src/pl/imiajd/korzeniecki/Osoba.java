package pl.imiajd.korzeniecki;

public class Osoba {

    private String nazwisko;


    public Osoba(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void pokaz() {
        System.out.println("Nazwisko: " + nazwisko);
    }

    public String getNazwisko() {
        return nazwisko;


    }
}