package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Owner o1 = new Owner("Jorge", "Rial", 528727);
        Owner o2 = new Owner("Jorge", "Porcel", 8223763);
        Owner o3 = new Owner("Jorge", "Lanata", 1263783);

        Apartment p1 = new Apartment(50, o1, 4, 'B',20000);
        House p2 = new House(200, o2, 2,39999);
        Office p3 = new Office(100, o3, 10,20000);

        System.out.println(o1);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);


        Owner o4 = new Owner("Kylo", "Ren", 2374623);
        p1.purchase(o2,99999);                                          //3

        Buy b1 = new Buy(100000, p1, o2);
        Buy b2 = new Buy(300000, p2, o3);
        Buy b3 = new Buy(200000, p3, o1);

        ArrayList<Buy> list = new ArrayList<Buy>();
        list.add(b1);
        list.add(b2);
        list.add(b3);


        double max = 0;                                         //4
        int index = 0;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).getAmount()) {
                max = list.get(i).getAmount();
                index = i;
            }
        }

        System.out.println("la mayor venta es: " + list.get(index));

        Rent r1 =new Rent(o1,1000,12,p1);
        Rent r2 =new Rent(o2,2000,24,p2);
        Rent r3 =new Rent(o3,3000,32,p3);

        ArrayList<Rent> rentList = new ArrayList<Rent>();
        rentList.add(r1);
        rentList.add(r2);
        rentList.add(r3);

        for(int i=0; i < rentList.size(); i++){                 //5
            rentList.get(i).Increase10(rentList.get(i));
        }
        for(int i=0; i < rentList.size(); i++){                 //5
            System.out.println("NUEVOS ALQUILERES: "+ rentList.get(i).toString());
        }
    }
}
