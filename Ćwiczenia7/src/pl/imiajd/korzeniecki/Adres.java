package pl.imiajd.korzeniecki;


public class Adres {

    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;


    public void Adresnr(String ulica, int nrDomu, int nrMieszkania, String miasto, String kod) {
        this.ulica = ulica;
        this.numer_domu = nrDomu;
        this.numer_mieszkania = nrMieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod;
    }

    public void Adresbnr(String ulica, int nrDomu, String miasto, String kod) {
        this.ulica = ulica;
        this.numer_domu = nrDomu;
        this.miasto = miasto;
        this.kod_pocztowy = kod;
    }

    public void show(){
        System.out.println(kod_pocztowy + ", " + miasto + "\n"+ ulica + ", "+numer_domu+", "+ numer_mieszkania);

    }

    public boolean przed(Adres a1, Adres a2){
        boolean spr = false;
        if(a1.kod_pocztowy == a2.kod_pocztowy){
            spr =  true;
        }
        return spr;
    }

}