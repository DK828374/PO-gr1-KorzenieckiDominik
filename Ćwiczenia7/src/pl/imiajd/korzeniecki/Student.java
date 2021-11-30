package pl.imiajd.korzeniecki;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, String kierunek){
        super(nazwisko);
        this.kierunek = kierunek;
    }

    public void pokaz() {
        super.pokaz();
        System.out.println("Kierunek: " + kierunek);
    }

    public String getKierunek() {
        return kierunek;
    }

}