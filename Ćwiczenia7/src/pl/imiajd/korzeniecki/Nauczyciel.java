package pl.imiajd.korzeniecki;

public class Nauczyciel extends Osoba{
    private int pensja;

    public Nauczyciel(String nazwisko, int pensja){
        super(nazwisko);
        this.pensja = pensja;
    }

    public void pokaz() {
        super.pokaz();
        System.out.println("Pensja: " + pensja + " złotych");
    }

    public int getPensja() {
        return pensja;
    }
}