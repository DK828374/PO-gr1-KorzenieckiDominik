package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//        Random r = new Random();
//        int n = r.nextInt(10) + 1;
//        System.out.println("N = " + n);
//        int[] tablica = new int[n];
//        for (int i = 0; i < n; i++) {
//            int k = r.nextInt(1998) - 999;
//            //int k = r.nextInt(10); //<-- Do testów
//            tablica[i] = k;
//        }
//
//        System.out.println("Tablica:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Tab[" + i + "] = " + tablica[i]);
//        }

        //Zadanie 1a)
//        int parzysta = 0;
//        int nieparzysta = 0;
//        for (int i = 0; i < n; i++) {
//            if (tablica[i] % 2 == 0) {
//                ++parzysta;
//            }
//            if (tablica[i] % 2 != 0) {
//                ++nieparzysta;
//            }
//        }
//
//        System.out.println("Liczba parzystych = " + parzysta);
//        System.out.println("Liczba niepazrystych = " + nieparzysta);
//
//        //Zadanie 1b)
//        int dodatnie = 0;
//        int ujemne = 0;
//        int zerowe = 0;
//        for (int i = 0; i < n; i++) {
//            if (tablica[i] > 0) {
//                ++dodatnie;
//            }
//            if (tablica[i] < 0) {
//                ++ujemne;
//            }
//            if (tablica[i] == 0) {
//                ++zerowe;
//            }
//        }
//
//        System.out.println("Liczba dodatnich = " + dodatnie);
//        System.out.println("Liczba ujemnych = " + ujemne);
//        System.out.println("Liczba zerowych = " + zerowe);
//
//        //Zadanie 1c)
//        int im = 0;
//
//        int max = tablica[0];
//        for (int i = 0; i < n; i++) {
//            if (tablica[i] > max)
//                max = tablica[i];
//        }
//
//        for (int j = 0; j < n; j++) {
//            if (max == tablica[j]) im++;
//        }
//
//
//        System.out.println("Element największy to: " + max + ", które występuje " + im + " raz\\y");
//
//        //Zadanie 1d)
//        int sdodatnie = 0;
//        int sujemne = 0;
//        for (int i = 0; i < n; i++) {
//            if (tablica[i] > 0) {
//                sdodatnie += tablica[i];
//            }
//            if (tablica[i] < 0) {
//                sujemne += tablica[i];
//            }
//        }
//
//
//        System.out.println("Suma dodatnich = " + sdodatnie);
//        System.out.println("Suma ujemnych = " + sujemne);
//
//        //Zadanie 1e)
//        int dlugosc = 0;
//        int mad = 0;
//        for (int i = 0; i < n; i++) {
//            if (tablica[i] > 0) {
//                ++dlugosc;
//                if (mad < dlugosc)
//                    mad = dlugosc;
//            } else
//                dlugosc = 0;
//        }
//        System.out.println("Najdłuszy ciąg licz dodatnich w tablicy ma długość " + mad + " elementów");
//
//        //Zadanie 1f)
//
//        for (int i = 0; i < n; i++) {
//            if (tablica[i] > 0) {
//                tablica[i] = 1;
//            }
//            if (tablica[i] < 0) {
//                tablica[i] = 0;
//            }
//        }
//        System.out.println("Tablica po zamianie:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Tab[" + i + "] = " + tablica[i]);
//        }
//
//
//        //Zadanie 1g)
//                int lewy = r.nextInt(n-1)+1;
//        int prawy = r.nextInt(n-1)+1;
//        if(prawy < lewy) {
//            int bufor = lewy;
//            lewy = prawy;
//            prawy = bufor;
//        }
//        int bufor;



//        System.out.println("prawy = "+ prawy + " lewy = "+lewy);
//        for(int i = 0; i <=n-1; i++){
//            for(int j = n-1; j>=0; j-- ){
//                if(lewy-1 >= prawy-1)
//                    break;
//            if(i == lewy-1 && j == prawy-1){
//                bufor = tablica[lewy-1];
//                tablica[lewy-1] = tablica[prawy-1];
//                tablica[prawy-1] = bufor;
//                lewy++;
//                prawy--;
//
//            }
//
//            }
//        }

        //Zadanie 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj n");
        int n = scan.nextInt();
        int[] tab = new int[n];
        int max = 999;
        int min = -999;
        generuj(tab, n, min, max);
        wypisz(tab);
        //Zadanie 2a)
        System.out.println("Liczba nieparzystych: "+ileNieparzystych(tab));
        System.out.println("Liczba parzystych: "+ileParzystych(tab));
        //Zadanie 2b)
        System.out.println("Liczba dodatnich: "+ileDodatnich(tab));
        System.out.println("Liczba ujemnych: "+ileUjemnych(tab));
        System.out.println("Liczba zer: "+ileZer(tab));
        //Zadanie 2c)
        System.out.println("Liczba maksymalnych: "+ileMax(tab));
        //Zadanie 2d)
        System.out.println("Liczba dodatnich: "+ sumaDodatnich(tab));
        System.out.println("Liczba ujemnych: "+sumaUjemnych(tab));
        //Zadanie 2e)
        System.out.println("Długosc fragmentu liczb dodatnich: "+ dlugoscDodatnia(tab));
        //Zadanie 2f)
        wypisz(signum(tab));
        //Zadanie 2g)
        wypisz(odwrocFragment(tab, 3, 7));


        //Zadanie 3
//        Scanner scan = new Scanner(System.in);
//        Random r = new Random();
//
//
//        int m = scan.nextInt();
//        while (m < 0 || m > 10){
//            m=scan.nextInt();
//        }
//        int n = scan.nextInt();
//        while (n < 0 || n > 10){
//            n = scan.nextInt();
//        }
//        int k = scan.nextInt();
//        while (k < 0 || k > 10) {
//            k = scan.nextInt();
//        }
//
//        int[][] a = new int[m][n];
//        int[][] b = new int[n][k];
//        int[][] c = new int[m][k];
//
//        //wypelnianie a[]
//        for (int i = 0; i <= m-1; i++){
//            System.out.println();
//            for(int j = 0; j<=n-1; j++){
//                a[i][j] = r.nextInt(1000+999)-999;
//                System.out.print("["+a[i][j]+"]");
//            }
//        }
//        System.out.println();
//        System.out.println();
//        //wypelnianie b[]
//        for(int i = 0; i <=n-1; i++){
//            System.out.println();
//            for(int j = 0; j <=k -1; j++){
//                b[i][j] = r.nextInt(1000+999)-999;
//                System.out.print("["+b[i][j]+"]");
//            }
//
//        }
//        //mnozenie a[]xb[]
//        System.out.println("\n\n");
//        for(int i=0;i<m;i++){
//            for(int j=0;j<k;j++){
//                c[i][j]=0;
//
//                for(int l=0;l<n;l++)
//                {
//                    c[i][j]+=a[i][l]*b[l][j];
//                }
//                System.out.print("["+c[i][j]+"]");
//            }
//            System.out.println();
//        }









    }

    public static int[] odwrocFragment(int[] tab, int lewy, int prawy){

        if(prawy < lewy) {
            int bufor = lewy;
            lewy = prawy;
            prawy = bufor;
        }
        int bufor;

        for(int i = 0; i <=tab.length-1; i++){
            for(int j = tab.length-1; j>=0; j-- ){
                if(lewy-1 >= prawy-1)
                    break;
                if(i == lewy-1 && j == prawy-1){
                    bufor = tab[lewy-1];
                    tab[lewy-1] = tab[prawy-1];
                    tab[prawy-1] = bufor;
                    lewy++;
                    prawy--;

                }

            }
        }

        return tab;
    }

    public static int[] signum(int[] tab){
        int[] sgn = new int[tab.length];
        for (int i = 0; i<=tab.length-1; i++){
            if(tab[i] < 0)
                sgn[i] = -1;
            if(tab[i] > 0)
                sgn[i] = 1;
            if(tab[i] == 0)
                sgn[i] = 0;
        }

        return sgn;
    }

    public static int dlugoscDodatnia(int[] tab){

        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i<=tab.length-1; i++){
            if(tab[i] > 0)
                count1++;
            if(tab[i] < 0) {
                if(count1 < count2)
                    count1 = 0;
                else {
                    count2 = count1;
                    count1 = 0;
                }
            }
        }
        return count2;

    }


    public static int sumaUjemnych(int[] tab){
        int suma = 0;
        for (int i = 0; i<=tab.length-1; i++){
            if(tab[i] < 0){
                suma +=tab[i];
            }

        }
        return suma;
    }

    public static int sumaDodatnich(int[] tab){
        int suma = 0;
        for (int i = 0; i<=tab.length-1; i++){
            if(tab[i] > 0){
                suma +=tab[i];
            }

        }
        return suma;
    }

    public static int ileMax(int[] tab){
        int ile = 0;
        int max = tab[0];
        for(int i = 0; i<= tab.length-1; i++){
            if(tab[i] > max){
                max = tab[i];
            }
        }
        for(int i = 0; i <=tab.length-1; i++){
            if (tab[i] == max)
                ile++;
        }

        return ile;
    }

    public static int ileZer(int[] tab){
        int ile = 0;
        for(int i = 0; i <=tab.length-1;i++){
            if(tab[i] == 0)
                ile++;
        }

        return ile;
    }

    public static int ileUjemnych(int[] tab){
        int ile = 0;
        for(int i = 0; i <=tab.length-1;i++){
            if(tab[i] < 0 )
                ile++;
        }
        return ile;
    }

    public static int ileDodatnich(int[] tab){
        int ile = 0;
        for (int i = 0; i<= tab.length-1; i++){
            if(tab[i] > 0)
                ile++;
        }


        return ile;
    }


    public  static int ileParzystych(int[] tab){
        int ile = 0;
        for(int i = 0; i<=tab.length-1;i++){
            if(tab[i] %2 == 0){
                ile++;
            }
        }
        return ile;
    }

    public static int ileNieparzystych(int[] tab){
        int ile = 0;
        for(int i = 0; i <=tab.length-1; i++){
            if(tab[i]%2 != 0){
                ile++;
            }
        }

        return ile;
    }

    public static void generuj(int[] tab, int n, int min, int max){
        Random r = new Random();
        for(int i = 0; i<=n-1; i++){
            tab[i] = r.nextInt(max+1-min)+min;
        }


    }
    public static void wypisz(int[] tab){
        for (int i = 0; i <= tab.length-1; i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println("\n");

    }
}


