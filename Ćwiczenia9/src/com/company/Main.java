package com.company;
import pl.imiajd.korzenieki.Osoba;
import pl.imiajd.korzenieki.Student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


        System.out.println("<><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Test Osoba");
        System.out.println();

        ArrayList<Osoba> gr = new ArrayList<>(5);
        Osoba osoba1 = new Osoba("Kowalczyk", LocalDate.of(1996, 11, 22));
        Osoba osoba2 = new Osoba("Nowak", LocalDate.of(1998,3,7));
        Osoba osoba3 = new Osoba("Korzeniecki", LocalDate.of(2001,8,18));
        Osoba osoba4 = new Osoba("Mucha", LocalDate.of(1998,3,7));
        Osoba osoba5 = new Osoba("Kowalczyk", LocalDate.of(1976,4,20));

        gr.add(osoba1);
        gr.add(osoba2);
        gr.add(osoba3);
        gr.add(osoba4);
        gr.add(osoba5);

        System.out.println("Przed: ");
        for(int i=0; i<5; i++)
        {
            System.out.println(gr.get(i));
        }

        Collections.sort(gr);

        System.out.println();
        System.out.println("Po: ");
        for(int i=0; i<5; i++)
        {
            System.out.println(gr.get(i));
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Test Student");
        System.out.println();
        ArrayList<Osoba> stud = new ArrayList<>(5);

        Student student1 = new Student("Kowal", LocalDate.of(1997, 3, 16), 4);
        Student student2 = new Student("Korzeniecki", LocalDate.of(2001, 8, 18), 3.5);
        Student student3 = new Student("Kowal", LocalDate.of(1998, 6, 20), 5);
        Student student4 = new Student("Kordowski", LocalDate.of(2000, 11, 14), 4);
        Student student5 = new Student("Sendrowski", LocalDate.of(2000, 11, 14), 4.5);

        stud.add(student1);
        stud.add(student2);
        stud.add(student3);
        stud.add(student4);
        stud.add(student5);

        System.out.println("Przed: ");
        for(int i=0; i<5; i++)
        {
            System.out.println(stud.get(i));
        }

        Collections.sort(stud);
        System.out.println();

        System.out.println("Po: ");
        for(int i=0; i<5; i++){
            System.out.println(stud.get(i));
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><>");

    }
}