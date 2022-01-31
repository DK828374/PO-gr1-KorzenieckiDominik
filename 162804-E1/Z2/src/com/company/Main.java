package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("dnao");
        al.add("aasd");



        printMarginal(al);
    }




    public static <T extends Iterable> void printMarginal(T t){
        t.forEach(x -> System.out.println(x));

    }
}
