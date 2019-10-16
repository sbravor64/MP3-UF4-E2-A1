package com.company;

import java.util.*;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Llapis llapis = (Llapis) o;
        return color == llapis.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
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
