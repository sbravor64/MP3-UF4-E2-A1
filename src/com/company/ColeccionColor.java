package com.company;

import java.util.Comparator;

public class ColeccionColor implements Comparator<Llapis> {

    @Override
    public int compare(Llapis llapis1, Llapis llapis2) {
        if(llapis1.getColor() < llapis2.getColor()){
            return -1;
        }
        if(llapis1.getColor() > llapis2.getColor()){
            return 1;
        } else { return 0; }
    }

}
