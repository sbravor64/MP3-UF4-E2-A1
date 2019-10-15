package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Llapis llapis = new Llapis();
        Llapis llapis2 = new Llapis();
        Llapis llapis3 = new Llapis();

        llapis.setColor(5);
        llapis2.setColor(2);
        llapis3.setColor(6);

        llapis.setGrosor((float) 1.5);
        llapis2.setGrosor((float) 2.5);
        llapis3.setGrosor((float) 0.5);

//        OutputterLlapis outputterLlapis = new OutputterLlapis(llapis);
//        outputterLlapis.toText();
//
//        OutputterLlapis outputterLlapis2 = new OutputterLlapis(llapis2);
//        outputterLlapis2.toText();

        List<Llapis> llista_llapis = new ArrayList<>();
        llista_llapis.add(llapis);
        llista_llapis.add(llapis2);
        llista_llapis.add(llapis3);

        ColeccionColor coleccionColor = new ColeccionColor();
        ColeccionGrosor coleccionGrosor = new ColeccionGrosor();

        Collections.sort(llista_llapis, coleccionColor);

        System.out.println("Ordenados por Color");
        for(Llapis datos : llista_llapis){
            System.out.println("Color: " + datos.getColor());
        }


        Collections.sort(llista_llapis, coleccionGrosor);
        System.out.println();
        System.out.println("Ordenados por Grosor");
        for(Llapis datos : llista_llapis){
            System.out.println("Grosor: " + datos.getGrosor());
        }

    }
}
