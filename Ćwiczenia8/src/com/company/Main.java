package com.company;
import pl.imiajd.korzenieki.Flet;
import pl.imiajd.korzenieki.Instrument;
import pl.imiajd.korzenieki.Skrzypce;
import pl.imiajd.korzenieki.Fortepian;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Instrument> muzyk = new ArrayList<>();
        Flet flet = new Flet();
        Fortepian fortepian = new Fortepian();
        Skrzypce skrzypce = new Skrzypce();

        muzyk.add(flet);
        muzyk.add(fortepian);
        muzyk.add(skrzypce);

        flet.setProducent("Metro");
        skrzypce.setProducent("Magnusl");
        fortepian.setProducent("Yamaha");

        flet.setRokProdukcji(1990, 12, 14);
        skrzypce.setRokProdukcji(2010, 4, 12);
        fortepian.setRokProdukcji(2002, 3, 10);

        System.out.println("Dźwięk");

        for (Instrument instrument : muzyk) {
            instrument.dzwiek();
        }

        System.out.println();
        System.out.println("Producenci:");
        System.out.println(flet.getProducent());
        System.out.println(fortepian.getProducent());
        System.out.println(skrzypce.getProducent());
        System.out.println();
        System.out.println("Lata produkcji:");
        System.out.println(flet.getRokProdukcji());
        System.out.println(skrzypce.getRokProdukcji());
        System.out.println(fortepian.getRokProdukcji());
    }
}