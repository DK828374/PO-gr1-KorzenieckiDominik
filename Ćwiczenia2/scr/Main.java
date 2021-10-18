package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//     //Zadanie 1a)
//
//
//        System.out.println("Podaj liczbe naturalna n");
//
//     int n1 = in.nextInt();
//     double suma1 = 0;
//
//     for(int i=0; i<n1; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            suma1 += a;
//        }
//
//        System.out.println("Suma wynosi: " + suma1);
//        //Zadanie 1b)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n = in.nextInt();
//        double iloczyn = 1;
//
//        for(int i=0; i<n; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            iloczyn *= a;
//        }
//
//        System.out.println("Iloczyn wynosi: " + iloczyn);
        //Zadanie 1c)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n2 = in.nextInt();
//        double suma2 = 0;
//
//        for(int i=0; i<n2; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            if (a<0) a=a*-1;
//            suma2 += a;
//        }
//
//        System.out.println("Suma wynosi: " + suma2);
//        //Zadanie1d)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n3 = in.nextInt();
//        double suma3 = 0;
//
//        for(int i=0; i<n3; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            if (a<0) a=a*-1;
//            a = Math.sqrt(a);
//            suma3 += a;
//        }
//
//        System.out.println("Suma wynosi: " + suma3);
//        //Zadanie1e)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n4 = in.nextInt();
//        double suma4 = 1;
//
//        for(int i=0; i<n4; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            if (a<0) a=a*-1;
//            suma4 *= a;
//        }
//
//        System.out.println("Iloczyn wynosi: " + suma4);
//        //Zadanie1f)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n5 = in.nextInt();
//        double suma5 = 0;
//
//        for(int i=0; i<n5; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            a = Math.pow(a, 2);
//            suma5 += a;
//        }
//
//        System.out.println("Suma wynosi: " + suma5);
//        //Zadanie1g)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n5 = in.nextInt();
//        double suma5 = 0;
//        double iloczyn5 = 1;
//
//        for(int i=0; i<n5; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            suma5 += a;
//            iloczyn5 *= a;
//        }
//
//        System.out.println("Suma wynosi: " + suma5);
//        System.out.println("Iloczyn wynosi: " + iloczyn5);
        //Zadanie1h)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n6 = in.nextInt();
//        double suma6 = 0;
//
//
//        for(int i=0; i<n6; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            a = a * Math.pow(-1, i+2);
//            suma6 += a;}
//
//
//        System.out.println("Suma wynosi: " + suma6);
//
//
//
//        //Zadanie1i)
//        System.out.println("Podaj liczbe naturalna n");
//
//        int n7 = in.nextInt();
//        double suma7 = 0;
//        double il = 1;
//        for(int i=0; i<n7; i++){
//            System.out.println("podaj a" + i + ": ");
//            double a = in.nextDouble();
//            il *= i+1;
//
//            a =(( a * Math.pow(-1, i+1)) / il);
//            suma7 += a;}
//
//
//        System.out.println("Suma wynosi: " + suma7);

//        //Zadanie1.2
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Podaj liczbe naturalna n");
//        int n = scn.nextInt();
//
//        double[] n8 = new double[n];
//        double[] suma8 = new double[n];
//
//        for(int i = 0; i<=n8.length-1; i++){
//            System.out.println("podaj a" + i + ": ");
//            n8[i] = scn.nextDouble();
//           }
//        double jeden = n8[0];
//        for(int i = 0; i<=n8.length-2; i++) {
//
//            suma8[i] = n8[i+1];
//
//
//        }
//        System.out.println("Ciąg:");
//        suma8[suma8.length-1] = jeden;
//        for(int i = 0; i <=suma8.length-1; i++){
//            System.out.println("a" + i + "= " +suma8[i]);
//        }


    //Zadanie2.1
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double[] liczby = new double[n];
        int counter = 0;
//        //Zadanie2.1a
//
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(liczby[i] %2 != 0)
//            counter++;
//       }
//        System.out.println(counter);

        //Zadanie2.1b

//
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(liczby[i] %3 == 0 && liczby[i]%5!=0)
//                counter++;
//       }
//        System.out.println(counter);

        //Zadanie2.1c

//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(sqrt(liczby[i]) %2 == 0)
//            counter++;
//       }
//        System.out.println(counter);

        //Zadanie2.1d
//        for(int i = 0; i<=liczby.length-1; i++) {
//            liczby[i] = scn.nextDouble();
//
//        }
//        for(int i = 1; i<=liczby.length-2; i++){
//            if(liczby[i] < (liczby[i-1]+liczby[i+1])/2)
//                counter++;
//        }
//          System.out.println(counter);

        //Zadanie2.1e
//        int factorial = 1;
//        for (int i = 0; i <= liczby.length - 1; i++) {
//            liczby[i] = scn.nextDouble();
//
//
//        }
//        for (int i = 1; i <= liczby.length - 1; i++) {
//            factorial *= i;
//            if (pow(2, i) <= liczby[i] && liczby[i] <= factorial)
//                counter++;
//        }
//        System.out.println(counter);

        //Zadanie2.1f
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(i+1%2 != 0 && liczby[i]%2==0)
//                counter++;
//       }
//        System.out.println(counter);

//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(liczby[i] %2 !=0 && liczby[i] >=0)
//                counter++;
//        }
//        System.out.println(counter);
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(abs(liczby[i]) < pow(i, 2))
//                counter++;
//        }
//        System.out.println(counter);

        //Zadanie2.2
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(liczby[i] > 0)
//                counter+=2*liczby[i];
//        }
//        System.out.println(counter);
        //Zadanie2.3
//        int zeros = 0, plus = 0, minus = 0;
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//            if(liczby[i] == 0)
//                zeros++;
//            if(liczby[i] < 0)
//                minus++;
//            if(liczby[i] > 0)
//                plus++;
//        }
//        System.out.println(counter);
        //Zadanie2.4
//        double max, min;
//
//        for(int i = 0; i<=liczby.length-1; i++){
//            liczby[i] = scn.nextDouble();
//
//        }
//        min = liczby[0];
//        max = liczby[0];
//        for(int i = 0; i<=liczby.length-1;i++)
//                if(i > 0) {
//                    if (liczby[i] > max)
//                        max = liczby[i];
//                    if(liczby[i] < min)
//                        min = liczby[i];
//                }
//
//        System.out.println(min+ "\n" + max);

        //Zadanie2.5

        for(int i = 0; i<=liczby.length-1; i++){
            liczby[i] = scn.nextDouble();

        }
        for(int i = 0; i<=liczby.length-2;i++){


            if(liczby[i] > 0 && liczby[i+1] > 0)
                counter++;
        }

        System.out.println(counter);
    }
}
