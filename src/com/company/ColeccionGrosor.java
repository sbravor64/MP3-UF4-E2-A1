package com.company;

import java.util.Comparator;

public class ColeccionGrosor implements Comparator<Llapis> {

    @Override
    public int compare(Llapis llapis1, Llapis llapis2) {
        if(llapis1.getGrosor() < llapis2.getGrosor()){
            return -1;
        }
        if(llapis1.getGrosor() > llapis2.getGrosor()){
            return 1;
        } else { return 0; }
    }

}
