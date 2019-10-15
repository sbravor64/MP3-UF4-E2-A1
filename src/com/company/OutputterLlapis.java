package com.company;

public class OutputterLlapis {

    private Llapis llapis;

    public OutputterLlapis(Llapis llapis) {
        this.llapis = llapis;
    }

    public void toText(){
        System.out.println(llapis.getColor() + "," + llapis.getGrosor());
    }



}
