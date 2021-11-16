package com.company;
import java.util.ArrayList;

    public class Main {

        public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
        {ArrayList<Integer> nowy = new ArrayList<>();
            nowy.addAll(a);
            nowy.addAll(b);
            return nowy;
        }
        public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
        {int dlugosc = a.size()+b.size();
            ArrayList<Integer> nowy = new ArrayList<>(dlugosc);
            int i = 0;
            while((a.size() > i) && (b.size() > i))
            {nowy.add(a.get(i));
                nowy.add(b.get(i));
                i++;
            }if(a.size()>i)
            {while(a.size() > i)
                {nowy.add(a.get(i));
                    i++;
                }
            }else if(b.size()>i)
            {while(b.size() > i)
                {nowy.add(b.get(i));
                    i++;
                }
            }else
            {return nowy;
            }return nowy;
        }

        public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
        {int dlugosc = a.size()+b.size();
            ArrayList<Integer> nowy = new ArrayList<>(dlugosc);
            for(int i=0; i<a.size(); i++)
            {for(int j=i+1; j<a.size(); j++)
                {int small = a.get(i);
                    if (a.get(j) < small)
                    {a.set(i,a.get(j));
                        a.set(j,small);
                    }
                }
            }for(int i=0; i<b.size(); i++)
            {for(int j=i+1; j<b.size(); j++)
                {int small = b.get(i);
                    if (b.get(j) < small)
                    {b.set(i,b.get(j));
                        b.set(j,small);
                    }
                }
            }int i = 0;
            while((a.size() > i) && (b.size() > i))
            {if(a.get(i)<b.get(i))
                {nowy.add(a.get(i));
                    nowy.add(b.get(i));
                }else
                {nowy.add(b.get(i));
                    nowy.add(a.get(i));
                }i++;
            }if(a.size()>i)
            {while(a.size() > i)
                {nowy.add(a.get(i));
                    i++;
                }
            }else if(b.size()>i)
            {while(b.size() > i)
                {nowy.add(b.get(i));
                    i++;
                }
            }else
            {return nowy;
            }return nowy;
        }

        public static ArrayList<Integer> reversed(ArrayList<Integer> a)
        {ArrayList<Integer> nowy = new ArrayList<>(a.size());
            nowy.addAll(a);
            for(int i=0; i<a.size(); i++)
            {for(int j=i+1; j<a.size(); j++)
                {int temp = nowy.get(i);
                    nowy.set(i,nowy.get(j));
                    nowy.set(j,temp);
                }
            }return nowy;
        }


        public static void reverse(ArrayList<Integer> a)
        {for(int i=0; i<a.size(); i++)
            {for(int j=i+1; j<a.size(); j++)
                {int temp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,temp);

                }
            }

        }

        public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        System.out.println("Tablica a\n" + a);
        System.out.println("Tablica b\n" + b);
            // ZADANIE1
        System.out.println("ZADANIE 1");
        System.out.println(append(a,b));

            // ZADANIE2
        System.out.println("ZADANIE 2");
        System.out.println(merge(a,b));

            // ZADANIE3
        System.out.println("ZADANIE3");
        System.out.println(mergeSorted(a,b));

            // ZADANIE4
        System.out.println("ZADANIE 4");
        System.out.println(reversed(a));

            // ZADANIE5
        System.out.println("ZADANIE 5");
        reverse(a);
        System.out.println(a);
        }
    }