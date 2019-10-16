package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Llapis implements Comparable<Llapis>{
    private int color;
    private float grosor;

    public int getColor(){ return color; }

    public void setColor(int color){
//        grosor = (int) (Math.random() * 3) + 1;
        this.color=color;
    }

    public  float getGrosor(){
        return grosor;
    }



    public void setGrosor(float grosor){
//        grosor = (float) (Math.random() * 2) + 1;
        this.grosor=grosor;
    }


    @Override
    public int compareTo(Llapis llapis) {
        if(getGrosor() < getGrosor()){
            return -1;
        }
        if(getGrosor() > getGrosor()){
            return 1;
        } else { return 0; }    }
}
