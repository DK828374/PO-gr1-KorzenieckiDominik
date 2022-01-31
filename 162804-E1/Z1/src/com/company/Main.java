package com.company;

import java.util.*;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> it = new ArrayList<Integer>();

        it.add(121);
        it.add(234);
        it.add(312);

        ArrayList<LocalTime> tm = new ArrayList<LocalTime>();

        LocalTime tm1 = LocalTime.of(11, 20);
        LocalTime tm2 = LocalTime.of(12, 20);
        LocalTime tm3 = LocalTime.of(11, 11);

        tm.add(tm1);
        tm.add(tm2);
        tm.add(tm3);



    }

    static <T extends Comparable> ArrayList jestPalindromem(ArrayList<T> list){

        ArrayList<T> aLirt = list;
        ArrayList<String> odp = new ArrayList<String>();
        odp.add("True");



        return odp;
    }
}
