package com.company;
import pl.imiajd.korzeniecki.Adres;
import  pl.imiajd.korzeniecki.Osoba;
import pl.imiajd.korzeniecki.Student;
import pl.imiajd.korzeniecki.Nauczyciel;
import pl.imiajd.korzeniecki.BetterRectangle;

public class Main {

    public static void main(String[] args) {
        //ZADANIE2
        Adres adres1 = new Adres();
        Adres adres2 = new Adres();
        adres1.Adresnr("Dworcowa", 12, 4, "Łomża", "18-400");
        adres2.Adresbnr("Nowogrodzka", 5, "Łomża", "18-402");
        adres1.show();
        adres2.show();

        //ZADANIE4

        Osoba osoba1 = new Osoba("Kowalczyk");
        Student student1 = new Student("Lisek", "mechanika");
        Nauczyciel nauczyciel1 = new Nauczyciel("Małak", 4800);
        System.out.println(" ");
        System.out.println("Osoba:<><><><><><><><><><><><><>");
        osoba1.pokaz();
        System.out.println("Student:<><><><><><><><><><><><>");
        student1.pokaz();
        System.out.println("Nauczyciel:><><><><><><><><><><>");
        nauczyciel1.pokaz();
        
        //ZADANIE 6
        System.out.println();
        BetterRectangle br = new BetterRectangle(0, 0, 2, 4);
        System.out.println("Obwód: " + br.getPerimeter());
        System.out.println("Pole: " + br.getArea());


    }
}